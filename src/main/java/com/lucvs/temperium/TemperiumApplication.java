package com.lucvs.temperium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TemperiumApplication {

	public static void main(String[] args) {

		SpringApplication.run(TemperiumApplication.class, args);
	}

}
