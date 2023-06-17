package classes;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Helper {
    
    public static String CreateSha256(String data) {
        MessageDigest algo = null;
        byte[] hash = null;
        StringBuilder buffer = null;
        try {
            algo = MessageDigest.getInstance("SHA-256");
            hash = algo.digest(data.getBytes("UTF-8"));
            buffer = new StringBuilder(2 * hash.length);
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) {
                    buffer.append('0');
                }
                buffer.append(hex);
            }
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        }
        return buffer.toString();
    }
    
}
