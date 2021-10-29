package com.teamwill.app.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


/*		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "password";
		String encodedPassword = passwordEncoder.encode(password);

		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		System.out.println("Invalid Password is : " + encodedPassword + "junk");
		System.out.println();


		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword+"junk");
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);*/

	}

	@Bean
	PasswordEncoder passwordEncoder(){

		return new BCryptPasswordEncoder();
	}


}
