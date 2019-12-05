package com.pccube.espd.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.PostConstruct;
import javax.crypto.NoSuchPaddingException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.service.GenericService;
import com.pccube.espd.utility.CryptoServiceHelper;
import com.pccube.espd.utility.CryptoManager;

@Service
public class CryptoServiceImpl extends GenericService implements CryptoService {
	
	@Value("${crypto.key}")
	private String key;
	
	@Value("${crypto.instance}")
	private String instance;

	private CryptoManager cryptoManager;
	
	static final Logger logger = Logger.getLogger(CryptoServiceImpl.class);
	
	@PostConstruct
	public void initCryptoManager() throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException {
		this.cryptoManager = new CryptoManager(key, instance);
	}
	
	@Override
	public String encrypt(String stringToEncrypt) throws ServiceException {
		try {
			return this.cryptoManager.encrypt(stringToEncrypt);
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}

	@Override
	public String decrypt(String stringToDecrypt) throws ServiceException {
		try {
			return this.cryptoManager.decrypt(stringToDecrypt);
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}
	
	public Object decryptBean(Object bean) throws ServiceException {
		try {
			String[][] supportoBean=CryptoServiceHelper.supportoBean(bean.getClass());
			for(String beanId:supportoBean[0]){
				String nomeMetodoGet="get"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String nomeMetodoSet="set"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String valore=(String) bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				valore=this.decrypt(valore);
				bean.getClass().getMethod(nomeMetodoSet, String.class).invoke(bean, valore);
			}
			return bean;
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}
	
	public Object encryptBean(Object bean) throws ServiceException {
		try {
			String[][] supportoBean=CryptoServiceHelper.supportoBean(bean.getClass());
			for(String beanId:supportoBean[0]){
				String nomeMetodoGet="get"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String nomeMetodoSet="set"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String valore=(String) bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				valore=this.encrypt(valore);
				bean.getClass().getMethod(nomeMetodoSet, String.class).invoke(bean, valore);
			}
			return bean;
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}
	
	public Object decryptBeanWithIteration(Object bean) throws ServiceException {
		try {
			String[][] supportoBean=CryptoServiceHelper.supportoBean(bean.getClass());
			for(String beanId : supportoBean[0]){
				String nomeMetodoGet="get"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String nomeMetodoSet="set"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String valore=(String) bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				valore=this.decrypt(valore);
				bean.getClass().getMethod(nomeMetodoSet, String.class).invoke(bean, valore);
			}
			for(String beanInBean : supportoBean[1]){
				String nomeMetodoGet="get"+((beanInBean.charAt(0)+"").toUpperCase())+beanInBean.substring(1);
				String nomeMetodoSet="set"+((beanInBean.charAt(0)+"").toUpperCase())+beanInBean.substring(1);
				Object beanDaDecriptare=bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				if(beanDaDecriptare!=null){
					bean.getClass().getMethod(nomeMetodoSet, beanDaDecriptare.getClass()).invoke(bean, decryptBeanWithIteration(beanDaDecriptare));
				}
			}
			return bean;
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}	
	
	public Object encryptBeanWithIteration(Object bean) throws ServiceException {
		try {		
			String[][] supportoBean=CryptoServiceHelper.supportoBean(bean.getClass());
			for(String beanId : supportoBean[0]){
				String nomeMetodoGet="get"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String nomeMetodoSet="set"+((beanId.charAt(0)+"").toUpperCase())+beanId.substring(1);
				String valore=(String) bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				valore=this.encrypt(valore);
				bean.getClass().getMethod(nomeMetodoSet, String.class).invoke(bean, valore);
			}
			for(String beanInBean : supportoBean[1]){
				String nomeMetodoGet="get"+((beanInBean.charAt(0)+"").toUpperCase())+beanInBean.substring(1);
				String nomeMetodoSet="set"+((beanInBean.charAt(0)+"").toUpperCase())+beanInBean.substring(1);
				Object beanDaCriptare=bean.getClass().getMethod(nomeMetodoGet).invoke(bean);
				if(beanDaCriptare!=null){
					bean.getClass().getMethod(nomeMetodoSet, beanDaCriptare.getClass()).invoke(bean, encryptBeanWithIteration(beanDaCriptare));
				}
			}
			return bean;
		} catch (Exception e) {
			logger.error(LOG_ERROR, e);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, e.getMessage());
		}
	}	
}
