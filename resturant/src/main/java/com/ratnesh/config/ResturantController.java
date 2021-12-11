package com.ratnesh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ResturantController {
	
	@Autowired ProfileConfig profileConfig;
	
	@GetMapping
	public String getResturant() {
		return "Resturant Name: " + profileConfig.getResturantTitle() 
		+ " address : " + profileConfig.getResturantAddress()
		+ " has total staff: " +profileConfig.getResturantStaff();
  }

}
