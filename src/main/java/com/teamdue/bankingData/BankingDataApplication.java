package com.teamdue.bankingData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Configuration
@EnableScheduling
public class BankingDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDataApplication.class, args);
	}

}
