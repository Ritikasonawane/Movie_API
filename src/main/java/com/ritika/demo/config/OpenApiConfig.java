package com.ritika.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				title = "Movie API",
				description = "Doing operations",
				summary = "By using mobie API we can search movies by the year of publish and top-rated",
				termsOfService = "T&C",
				contact = @Contact(
						name = "Ritika",
						email = "abc.@gmail.com"
						),
				license = @License(
						name = "Your License number"
						),
				version = "v1"
				
				),
		servers = {
				@Server(
						description = "SpringBoot",
						url = "http://localhost:8080"
						),
				@Server(
						description = "Test",
						url = "http://localhost:8080"
						)
				
		}
		
		)


public class OpenApiConfig {

}
