/**
 * Clase encargada de cifrar
 * @author David Díaz García
 * @date 27-05-2015
 */
package david.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

public class Encryptor {

	public final static String MD5 = "md5";

	/**
	 * Método que cifra un string en MD5
	 * 
	 * @param String
	 *            word
	 * @return String
	 */
	public static String encriptionMD5(String word) {
		MessageDigest md = null;

		try {
			md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("No se puede instanciar MessageDigest: " + e.getMessage());
		}

		md.update(word.getBytes());

		return Compressor.compressBase64(new String(md.digest()));
	}

	/**
	 * Método que gestiona el tipo de cifrado
	 * 
	 * @param String
	 *            type
	 * @param Object
	 *            object
	 * @return Object
	 */
	public Object encriptor(String type, Object object) {
		Object result = null;
		if (type.equals(MD5)) {
			result = encriptionMD5((String) object);
		}
		return result;
	}
}