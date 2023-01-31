package com.xoriant.controllers;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoriant.dao.DAOImpl;
import com.xoriant.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {

//	@Autowired
//	private RegisterService registerService;
	
	@GetMapping("/login")
	public <users> String UserLogin(Model model) {
		System.out.println("logging in...");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//User user=new User();
		User user=(User) context.getBean("usr");
		model.addAttribute("user",user);
		
		return "user";
	}
	
	@PostMapping("/register")
	public String Register(@Valid @ModelAttribute("user") User user,Errors errors,Model model,HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		if(errors.hasErrors()) {
			return "user";
		}else {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			DAOImpl impl=(DAOImpl) context.getBean("impl");
		System.out.println("Completed");
		impl.addUser(user, req, res, model);
		
		req.setAttribute("user",user);
		return "successlogin";
		}
	}
	
	
}	

