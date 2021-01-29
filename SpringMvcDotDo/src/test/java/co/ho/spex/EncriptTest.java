package co.ho.spex;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptTest {
	public static void main(String[] args) {
		
		BCryptPasswordEncoder scpwd = new BCryptPasswordEncoder();
		
		// 암호화 하기전
		String password = scpwd.encode("1234"); 
		String password2 = scpwd.encode("1111"); 
		System.out.println(password);
		System.out.println(password.equals(password2));
		System.out.println(scpwd.matches("1112", password2));
		
	}
}
