package com.api.devops.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsAssignmentApplication {

	@GetMapping
	public String getMessage() {
		return "Hello this is DevOps Testing";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevOpsAssignmentApplication.class, args);
	}

}
