package com.dot.examinator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ExaminatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminatorApplication.class, args);
	}
}
