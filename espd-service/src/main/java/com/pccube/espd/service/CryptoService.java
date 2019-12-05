package com.pccube.espd.service;

import com.pccube.espd.exception.ServiceException;

public interface CryptoService {
	
	public String encrypt(String stringToEncrypt) throws ServiceException;

	public String decrypt(String stringToDecrypt) throws ServiceException;
	
	public Object encryptBeanWithIteration(Object bean) throws ServiceException;
	
	public Object decryptBeanWithIteration(Object bean) throws ServiceException;
	
}
