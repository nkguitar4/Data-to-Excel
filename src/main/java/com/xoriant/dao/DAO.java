package com.xoriant.dao;

import org.springframework.ui.Model;

import com.xoriant.models.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface DAO {
	
	public String addUser(User user,HttpServletRequest req,HttpServletResponse res,Model model);
	


}
