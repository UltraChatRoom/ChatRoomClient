package main.com.chatroomclient.test;

import java.security.MessageDigest;

/**
 * @className: PasswordSecurityTest
 * @program: ChatRoomClient
 * @description: //TODO 密码加密安全测试
 * @author: GirtSeanking
 * @create: 2020-11-18 08:30
 **/

public class PasswordSecurityTest {

    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String generatePassword(String password) {
        return encodeByMD5(password);
    }

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

    private static String byteArrayToHexString(byte[] bytes) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            resultSb.append(byteToHexString(bytes[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static boolean validatePassword(String password, String inputPassword) {
        if (password.equals(encodeByMD5(inputPassword))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String password = "Liaojianbo8820";
        String result = "";
        PasswordSecurityTest pse = new PasswordSecurityTest();
        System.out.println("未加密："+ password);
        result = pse.generatePassword(password);
        System.out.println("加密后：" + result);
        System.out.println("验证密码是否正确：" + pse.validatePassword(result, password));
  }
}