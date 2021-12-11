package com.ratnesh.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RefreshScope
public class SchoolController {

	@Value("${school.name}")
	private String schoolName;

	@Value("${school.address}")
	private String schoolAddress;

	@GetMapping
	public String getSchool() {

		return "School Name: " + schoolName + "  Address: " + schoolAddress;
	}

}
