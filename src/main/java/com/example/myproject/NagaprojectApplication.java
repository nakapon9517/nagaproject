package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NagaprojectApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/login"); //指定したキーの値(コンテキストのパス)を取得 /login
		SpringApplication.run(NagaprojectApplication.class, args);//取得したパスの実行する役割？
	}
}
