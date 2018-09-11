package com.carol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启zuul的功能
public class EurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApplication.class, args);
	}
}
