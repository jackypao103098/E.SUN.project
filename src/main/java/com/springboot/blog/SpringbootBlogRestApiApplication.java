package com.springboot.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBlogRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}
	public  double add(double a, double b) {
		return a + b;
	}
public  double subtract(double a, double b) {
		return a - b;
	}
public  double multiply(double a, double b) {
		return a * b;
	}

	public  double divide(double a, double b) {
		if(b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		}
		return a / b;
	}

	public  double square(double a) {
		return a * a;
	}

}
