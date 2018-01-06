package com.devmind.junit5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(Junit5ApplicationProperties.class)
public class Junit5Application {

	public static void main(String[] args) {
		SpringApplication.run(Junit5Application.class, args);
	}

}
