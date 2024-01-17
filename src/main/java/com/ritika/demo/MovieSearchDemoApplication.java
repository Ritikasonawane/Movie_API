package com.ritika.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieSearchDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieSearchDemoApplication.class, args);
		System.out.println("Hello World!!");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
