package com.dosi.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.dosi.projet")
@EnableJpaRepositories(basePackages = {"dao"})
@Configuration
@EnableAutoConfiguration
@ComponentScan("controller")
public class Projet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projet1Application.class, args);
	}

}

