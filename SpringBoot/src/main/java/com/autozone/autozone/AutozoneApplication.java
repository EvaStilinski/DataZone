package com.autozone.autozone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MetricsController.class)
public class AutozoneApplication {
	public static void main(String[] args) {
		SpringApplication.run(AutozoneApplication.class, args);
		//SpringApplication.run(MetricsController.class, args);
	}
}
