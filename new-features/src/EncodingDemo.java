import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {
	public static void main(String[] args) {
		
		String password = "P@ssw0rd";
		System.out.println(password);
		
		Encoder encoder = Base64.getEncoder();
		String encodePassword = encoder.encodeToString(password.getBytes());
		System.out.println(encodePassword);
		
		Decoder decoder = Base64.getDecoder();
		String decodePassword = new String(decoder.decode(encodePassword.getBytes()));
		System.out.println(decodePassword);
	}
}
