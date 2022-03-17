package com.syn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LoanConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoanConfigApplication.class, args);
	}


}
