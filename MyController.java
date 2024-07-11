package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/register")
	public String registerForm()
	{
		return "register";
	}
	
	@RequestMapping("/login")
	public String loginForm()
	{
		return "login";
	}
	
	@RequestMapping("/about")
	public String aboutPage()
	{
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contactPage()
	{
		return "contact";
	}
}
