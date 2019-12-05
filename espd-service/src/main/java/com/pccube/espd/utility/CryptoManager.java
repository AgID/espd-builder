package com.pccube.espd.utility;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CryptoManager {
	
	private int costant2 = 2;
	private Cipher cipherEncrypt;
	private Cipher cipherDecrypt;
	private int constant00FF = 0x00ff;
	private int constant000F = 0x000f;
	private int exadecimalSize = 16;
	private int caracterSize = 4;
	
	public CryptoManager(String key, String instance) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF8"), instance);
		cipherEncrypt = Cipher.getInstance(instance);
		cipherEncrypt.init(Cipher.ENCRYPT_MODE, secretKey);
		cipherDecrypt = Cipher.getInstance(instance);
		cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKey);
	}
	
	public String encrypt(String data) throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		if(data == null || data.equals("")) {
			return data;
		}
		return byteArrayToHex(cipherEncrypt.doFinal(data.getBytes("UTF8")));
	}

	public String decrypt(String encrypted) throws IllegalBlockSizeException, BadPaddingException {
		if(encrypted == null || encrypted.equals("")) {
			return encrypted;
		}
		byte[] encryptedData = hexStringToByteArray(encrypted);
		byte[] decrypted = cipherDecrypt.doFinal(encryptedData);
		return new String(decrypted);
	}
	
	private String byteArrayToHex(byte[] a) {
		int hn;
		int ln;
		int cx;
		String hexDigitChars = "0123456789abcdef";
		StringBuilder buf = new StringBuilder(a.length * costant2);
		for (cx = 0; cx < a.length; cx++) {
			hn = ((int) (a[cx]) & constant00FF) / exadecimalSize;
			ln = ((int) (a[cx]) & constant000F);
			buf.append(hexDigitChars.charAt(hn));
			buf.append(hexDigitChars.charAt(ln));
		}
		return buf.toString();
	}
	
	private byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / costant2];
		for (int i = 0; i < len; i += costant2) {
			data[i / costant2] = (byte) ((Character.digit(s.charAt(i), exadecimalSize) << caracterSize) + Character.digit(s.charAt(i + 1), exadecimalSize));
		}
		return data;
	}
	
}
