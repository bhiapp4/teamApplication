package teamApplication;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestClass {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedString = encoder.encode("secret");
		System.out.println(encodedString);
	}
	
	public static void generateMD5Password(){
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		String encodedString = encoder.encodePassword("secret",null);
		System.out.println(encodedString);		
	}
}
