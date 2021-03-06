package com.fd.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.fd.microSevice.web.PortApplicationListener;

@ServletComponentScan("com.fd.microSevice.web")
@SpringBootApplication
public class MicroserviceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientApplication.class, args);
	}

	@Bean
	public PortApplicationListener portApplicationListener() {
		return new PortApplicationListener();
	}
}
