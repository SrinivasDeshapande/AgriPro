package com.et.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.et")
public class SpringMain {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class,args);
	}
}
