package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemoryOauth2Application implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
	};
	
	public static void main(String args[]) {
		SpringApplication.run(MemoryOauth2Application.class, args);
	};


}
