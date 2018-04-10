package com.leo.datas.Utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/****
 * AES加解密工具类
 * @author aqq
 *
 */
public class AesUtil {
	/****
	 * 加密消息体
	 * @param appkey
	 * @param bodyStr
	 * @return
	 */
	public String encrypt(String appkey,String str){
		String result ="";
		try {
        	String data = str;
            String key = appkey;
            String iv = appkey;
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            int blockSize = cipher.getBlockSize();
            byte[] dataBytes = data.getBytes("utf-8");
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);
            String encryptedStr = new sun.misc.BASE64Encoder().encode(encrypted);
            encryptedStr = encryptedStr.replaceAll("\n", "").replaceAll("\r", "");
            //System.out.println(encryptedStr);
            //strResult = new String(encrypted,"UTF-8");
            result = encryptedStr;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return result;
	}
	
	/****
	 * AES解密
	 * @param data
	 * @param key  16位字符串
	 * @return
	 * @throws Exception
	 */
    public  String desCrypt(String key,String data) {
        try
        {
            String iv = key;

            byte[] encrypted1 = new sun.misc.BASE64Decoder().decodeBuffer(data);

            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original,"utf-8");
            String strAscii0 = asciiToString("0");
            originalString = originalString.replaceAll(strAscii0, "");
            return originalString;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /****
	 * ascii码转字符串
	 * @param value
	 * @return
	 */
	public  String asciiToString(String value)  
	{  
	    StringBuffer sbu = new StringBuffer();  
	    String[] chars = value.split(",");  
	    for (int i = 0; i < chars.length; i++) {  
	        sbu.append((char) Integer.parseInt(chars[i]));  
	    }  
	    return sbu.toString();  
	}
    public static void main(String[] args) {
    	AesUtil aesUtil = new AesUtil();
    	String dd = "汉字";
    	System.out.println(dd);
    	String aa = aesUtil.encrypt("aeaa0eff460b4e20",dd );
    	dd = aesUtil.desCrypt("aeaa0eff460b4e20",aa );
    	System.out.println(aa);
    	System.out.println(dd);
    }
}
