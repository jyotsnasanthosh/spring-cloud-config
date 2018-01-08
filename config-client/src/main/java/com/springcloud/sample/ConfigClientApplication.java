package com.springcloud.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@RestController
	//To refresh the application.properties without stopping the application
	//To read all the properties from the GIT repository using config server
	@RefreshScope 
	class MessageSource{
		
		@Value("${message}")
		String message;
		
		@RequestMapping(value="/value")
		public String getMessage() {
			return message;
		}
	}
}
