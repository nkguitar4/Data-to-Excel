package com.xoriant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/successlog")
public class SuccessController {
	
	@GetMapping("/display")
	public String successLogin(Model model) {	
		System.out.println("display");
		return "display";
	}
	
}
