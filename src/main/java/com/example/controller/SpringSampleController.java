package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Message;

@Controller
public class SpringSampleController {
	
	@RequestMapping(value="/index")
	public String index() {
		return "Hello";
	}




}