package com.aes;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESTools {

    public static final String ENCODING = "UTF-8";
    private static String ALGO = "AES";
    private static String ALGO_MODE_PATTERN = "AES/CBC/PKCS5Padding";
    private static String DEF_KEY = "sfsafasdfsafasff";

    private static String DEF_IV = "phjlknslfdhksldf";

    private static int validLength = 16;

    public static void setDefKey(String key) {
        DEF_KEY = key;
    }

    public static void setDefIv(String iv) {
        DEF_IV = iv;
    }

    private AESTools(){}

    public String encrypt(String sSrc) throws Exception {
        return encrypt(sSrc, DEF_KEY);
    }

    public String encrypt(String sSrc, String sKey) throws Exception {
        return encrypt(sSrc, sKey, DEF_IV);
    }

    public String encrypt(String sSrc, String sKey, String sIv) throws Exception {
        if (sKey == null) {
            return null;
        }
        if (sKey.length() != validLength) {
            return null;
        }
        byte[] raw = sKey.getBytes(ENCODING);
        SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGO);
        Cipher cipher = Cipher.getInstance(ALGO_MODE_PATTERN);
        IvParameterSpec iv = new IvParameterSpec(sIv.getBytes(ENCODING));
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes(ENCODING));
        return Base64.encodeBase64String(encrypted);
    }

    public String decrypt(String sSrc) throws Exception {
        return decrypt(sSrc, DEF_KEY);
    }

    public String decrypt(String sSrc, String sKey) throws Exception {
        return decrypt(sSrc, sKey, DEF_IV);
    }

    public String decrypt(String sSrc, String sKey, String sIv) throws Exception {
        if (sKey == null) {
            return null;
        }

        if (sKey.length() != validLength) {
            return null;
        }
        byte[] raw = sKey.getBytes("ASCII");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGO);
        Cipher cipher = Cipher.getInstance(ALGO_MODE_PATTERN);
        IvParameterSpec iv = new IvParameterSpec(sIv.getBytes(ENCODING));
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] encrypted1 = Base64.decodeBase64(sSrc);
        byte[] original = cipher.doFinal(encrypted1);
        return new String(original, ENCODING);
    }

    public static void main(String[] args) throws Exception {
        AESTools aesTools = new AESTools();
        String encryptCipher = aesTools.encrypt("Test1234", "qbophldwayeabafa", "qxemloyakrsfmtyb");
        System.out.println("1DiKQeucthR+8gjq1mt4eg==".equals(encryptCipher));
        System.out.println(aesTools.decrypt("mQ3dmQnKPMuaGnVmGqjEMw==", "xpjbjrqtcvaajvpw", "mxwpwkeqnfgbdlxb"));
        // System.out.println(aesTools.decrypt("heC9TYKPGk32ukdJJU9wHQ==", "xpjbjrqtcvaajvpw", "mxwpwkeqnfgbdlxb"));
    }

}
