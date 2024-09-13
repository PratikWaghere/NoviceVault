package com.havenNovice.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		System.out.println("Hello word");
		SpringApplication.run(JavaApplication.class, args);
	}

}
