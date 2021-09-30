package com.Hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.Hotel.service.*;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private UserService userService;
	
	
	
	@GetMapping("/home")
	public ModelAndView homePage() {
		
		return new ModelAndView("/home");
	}
}
