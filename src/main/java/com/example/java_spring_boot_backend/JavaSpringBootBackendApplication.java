package com.example.java_spring_boot_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = {"com.example.java_spring_boot_backend.services", "com.example.java_spring_boot_backend.repositories"})

@SpringBootApplication
//@ComponentScan("com.example.java_spring_boot_backend")
public class JavaSpringBootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootBackendApplication.class, args);
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
