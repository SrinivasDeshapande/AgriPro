package com.et.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.et")
@EnableJpaRepositories("com.et")
@EntityScan("com.et")
public class SpringMain {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class,args);
	}
}
