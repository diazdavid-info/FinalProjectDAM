/**
 * Clase encargada de compactar mensajes
 * @author David Díaz García
 * @date 28-05-2015
 */
package david.security;

import org.apache.tomcat.util.codec.binary.Base64;

public class Compressor {

	/**
	 * Método que comprime en BASE64
	 * 
	 * @return String
	 */
	public static String compressBase64(String string) {
		return new String(Base64.encodeBase64(string.getBytes()));
	}

}
