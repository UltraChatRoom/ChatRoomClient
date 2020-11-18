package main.com.chatroomclient.java.utils;

import main.com.chatroomclient.java.common.constant.SystemConstant;

import java.security.MessageDigest;
import java.util.Random;

/**
 * @className: ScurityUtils
 * @program: ChatRoomClient
 * @description: //TODO 程序安全工具
 * @author: GirtSeanking
 * @create: 2020-11-18 08:12
 **/

public class SecurityUtils {

    /** 十六进制转换码 */
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /**
     * @Author GirtSeanking
     * @Description //TODO 创建一个新的账号
     * @Date 9:20
     * @Param []
     * @return java.lang.String //TODO 返回新账号
     **/
    public static String createNewLoginName() {
        String newLoginName = "";
        Random random = new Random();
        for (int i = 0; i < SystemConstant.LOGIN_NAME_MAX_LENGTH; i++) {
            newLoginName += String.valueOf(random.nextInt(10));
        }
        return newLoginName;
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 密码加密
     * @Date 9:07 
     * @Param [password] //TODO 需要加密的密码
     * @return java.lang.String //TODO 返回加密完成的字符串
     **/
    public static String generatePassword(String password) {
        return encodeByMD5(password);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 对密码进行MD5加密
     * @Date 9:08 
     * @Param [encryptedString] //TODO 需要加密的字符串
     * @return java.lang.String //TODO 返回加密完成的字符串
     **/
    private static String encodeByMD5(String encryptedString) {
        if (encryptedString != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] results = md.digest(encryptedString.getBytes());
                String resultString = byteArrayToHexString(results);
                String pass = resultString.toUpperCase();
                return pass;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 将一串字节转换成十六进制
     * @Date 9:10 
     * @Param [bytes] //TODO 字节数组
     * @return java.lang.String //TODO 返回转换完成的字符串
     **/
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            resultSb.append(byteToHexString(bytes[i]));
        }
        return resultSb.toString();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 将一个字节转换成十六进制的形式的字符串
     * @Date 9:11 
     * @Param [b] //TODO 一个字节
     * @return java.lang.String //TODO 返回转换卧槽的字符串
     **/
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    
    /**
     * @Author GirtSeanking
     * @Description //TODO 比较在数据库中加密后的密码和用户输入的密码是否一致
     * @Date 9:12 
     * @Param [encryptionPassword, inputPassword] //TODO [数据库中的加密密码， 用户输入的密码]
     * @return boolean
     **/
    public static boolean validatePassword(String encryptionPassword, String inputPassword) {
        if (encryptionPassword.equals(encodeByMD5(inputPassword))) {
            return true;
        } else {
            return false;
        }
    }

}