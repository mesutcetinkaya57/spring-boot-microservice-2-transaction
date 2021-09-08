package com.sha.springbootmicroservices2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservices2TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservices2TransactionApplication.class, args);
	}

}
