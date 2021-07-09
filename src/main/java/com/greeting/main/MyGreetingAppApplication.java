package com.greeting.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.greeting.main")
@EnableJpaRepositories("com.greeting.main.Repository")
public class MyGreetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyGreetingAppApplication.class, args);
	}

}
