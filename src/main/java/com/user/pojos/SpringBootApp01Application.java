package com.user.pojos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp01Application.class, args);
		
	}
	public void modified() {
		System.out.println("welcome to spring boot");
	}

}
