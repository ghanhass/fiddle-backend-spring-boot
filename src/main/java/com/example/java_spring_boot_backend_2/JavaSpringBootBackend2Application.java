package com.example.java_spring_boot_backend_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.java_spring_boot_backend_2.services", "com.example.java_spring_boot_backend_2.repositories"})
public class JavaSpringBootBackend2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootBackend2Application.class, args);
	}

}
