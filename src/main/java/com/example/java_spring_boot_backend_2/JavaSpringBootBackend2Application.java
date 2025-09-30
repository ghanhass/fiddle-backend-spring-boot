package com.example.java_spring_boot_backend_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = {"com.example.java_spring_boot_backend_2.services", "com.example.java_spring_boot_backend_2.repositories"})

@SpringBootApplication
//@ComponentScan("com.example.java_spring_boot_backend_2")
public class JavaSpringBootBackend2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootBackend2Application.class, args);
	}

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("*");
			}
		};
	}*/

}
