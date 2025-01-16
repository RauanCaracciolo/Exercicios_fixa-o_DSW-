package model.cypher;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cypher {



	public static String cypher(String senha) {
		try {
		var bits = senha.getBytes();
		var md = MessageDigest.getInstance("SHA-256");
		md.update(bits);
		byte[] hash = md.digest();

		StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
}
