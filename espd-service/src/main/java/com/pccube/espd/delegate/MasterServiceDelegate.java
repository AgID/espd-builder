package com.pccube.espd.delegate;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pccube.espd.enums.Agent;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
import com.pccube.espd.model.TenderingCriterionModel;
import com.pccube.espd.param.Item;
import com.pccube.espd.param.Request;
import com.pccube.espd.service.CryptoService;
import com.pccube.espd.service.MasterService;
import com.pccube.espd.utility.UtilityManager;

@Component
public class MasterServiceDelegate {
	
	@Autowired
	private MasterService service;

	@Autowired
	private CryptoService cryptoService;


	public Object init(java.io.Reader body) throws ServiceException, IOException {
		
		Object obj = null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		Request req = mapper.readValue(body, Request.class);
		
		String agent = req.getAuthentication().getUser();
		
		if (agent.equalsIgnoreCase(Agent.CONTRACTING_AUTHORITY.getCode())) {

			obj = (QualificationApplicationRequestModel)this.cryptoService.encryptBeanWithIteration(this.service.initRequest());
			
		} else if (agent.equalsIgnoreCase(Agent.ECONOMIC_OPERATOR.getCode())){

			obj = (QualificationApplicationResponseModel)this.cryptoService.encryptBeanWithIteration(this.service.initResponse());
		}	
		
		return obj;
	}
	
	public byte[] download(java.io.Reader body) throws ServiceException, IOException {
		
		ByteArrayOutputStream out = null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		Request req = mapper.readValue(body, Request.class);
		
		String agent = req.getAuthentication().getUser();
		
		if (agent.equalsIgnoreCase(Agent.CONTRACTING_AUTHORITY.getCode())) {
			
			QualificationApplicationRequestModel requestModel = (QualificationApplicationRequestModel)
					this.cryptoService.decryptBeanWithIteration(mapper.convertValue(req.getBean(), QualificationApplicationRequestModel.class));
			out = (ByteArrayOutputStream)this.cryptoService.encryptBeanWithIteration(this.service.downloadRequest(requestModel));
			
		} else if (agent.equalsIgnoreCase(Agent.ECONOMIC_OPERATOR.getCode())){
			
			QualificationApplicationResponseModel responseModel = (QualificationApplicationResponseModel)
					this.cryptoService.decryptBeanWithIteration(mapper.convertValue(req.getBean(), QualificationApplicationResponseModel.class));
			out = (ByteArrayOutputStream)this.cryptoService.encryptBeanWithIteration(this.service.downloadResponse(responseModel));
		}
		
		return (out != null) ? out.toByteArray() : null;
	}
	

	public Object upload(java.io.Reader body) throws ServiceException, IOException {
		
		Object obj = null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		Request req = mapper.readValue(body, Request.class);
		
		String agent = req.getAuthentication().getUser();
		
		if (agent.equalsIgnoreCase(Agent.CONTRACTING_AUTHORITY.getCode())) {

			InputStream requestStream = UtilityManager.getStreamFromFile(req.getBean());
			
			obj = (QualificationApplicationRequestModel)this.cryptoService.encryptBeanWithIteration(this.service.uploadRequestCA(requestStream));
			
		} else if (agent.equalsIgnoreCase(Agent.ECONOMIC_OPERATOR.getCode())){

			InputStream stream = UtilityManager.getStreamFromFile(req.getBean());
			
			obj = (QualificationApplicationResponseModel)this.cryptoService.encryptBeanWithIteration(this.service.uploadResponseOrRequestEO(stream));
		}	
		
		return obj;
	}
	
	
	public List<TenderingCriterionModel> initCriteria(java.io.Reader body) throws ServiceException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();

		List<TenderingCriterionModel> list = this.service.initCriteria(mapper.readValue(body, Item.class).getCriteriaKeys());
		
		for(TenderingCriterionModel bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		
		return list;
	}
	
	
	public String generateUUID() {
		return UUID.randomUUID().toString();
	}
}
