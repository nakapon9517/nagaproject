package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NagaprojectApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/login");
		SpringApplication.run(NagaprojectApplication.class, args);
	}
}
