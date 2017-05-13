package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.test.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.test"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TestApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
