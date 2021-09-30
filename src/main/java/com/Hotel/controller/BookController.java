package com.Hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.Hotel.service.*;

@RestController
public class BookController {

	@Autowired
	private searchService searchService;
	
	@GetMapping("/bookHotel")
public ModelAndView searchHotelPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("bookHotel");
		return modelAndView;
	}
}
