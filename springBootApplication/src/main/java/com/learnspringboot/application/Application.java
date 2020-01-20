package com.learnspringboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"com.learnspringboot", "com.learnspringboot.repository"})
@SpringBootApplication(scanBasePackages = {"com.learnspringboot" })
@EnableJpaRepositories(basePackages = "com.learnspringboot.repository")
@EntityScan(basePackages = "com.learnspringboot.model")
public class Application {
	
	/*
	 * @PostConstruct void started() {
	 * TimeZone.setDefault(TimeZone.getTimeZone("UTC")); }
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
