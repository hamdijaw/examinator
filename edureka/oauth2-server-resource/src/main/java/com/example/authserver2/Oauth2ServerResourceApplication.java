package com.example.authserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableResourceServer
//@RestController
public class Oauth2ServerResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ServerResourceApplication.class, args);
	}

	/*@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}*/
}
