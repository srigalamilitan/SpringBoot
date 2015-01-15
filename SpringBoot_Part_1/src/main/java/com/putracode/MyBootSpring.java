package com.putracode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
public class MyBootSpring {

	public static void main(String[] args) {
		SpringApplication.run(MyBootSpring.class, args);
	}

}
