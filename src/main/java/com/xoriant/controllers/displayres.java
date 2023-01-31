package com.xoriant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class displayres {
	
	
	@RequestMapping("/display")
	public String display() {	
	
		System.out.println("display fn");
		return "display";	
	}

}
