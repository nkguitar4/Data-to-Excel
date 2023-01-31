package com.xoriant.MVCproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class MvCprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MvCprojectApplication.class, args);
		
	}

}
