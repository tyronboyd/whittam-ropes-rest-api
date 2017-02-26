package com.whittam.ropes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring boot rest API with MongoDB.
 * 
 * Author tyron boyd.
 *
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
