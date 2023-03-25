package AdminSecurity.AdminSecurity;

import AdminSecurity.JwtAuthentication.JwtTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class AdminSecurityApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {



		SpringApplication.run(AdminSecurityApplication.class, args);

		JwtTest jwtTest = new JwtTest();
		String jwtToken = jwtTest.createJwt("userId","userEmail");


		System.out.println(jwtTest.checkJwt(jwtToken));
	}

}
