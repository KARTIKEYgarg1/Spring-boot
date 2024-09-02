package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
// DISPATCHER SERVELET IN SPRING
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.repo.UserRepo;

@Controller
public class HelloController{
	@Autowired
	private UserRepo repo;
	@RequestMapping("hello")
	public @ResponseBody String s() {
		return "Hello";
	}
	@RequestMapping("hi")
	public String s1(Model m,@RequestParam("query") String query) {
		m.addAttribute("query",repo.returnS(query));
		return "Welcome";
	}
	@RequestMapping("temp")
	public String s0(Model m) {
		m.addAttribute("msg", "Ohayo");
		return "Temp";
	}
	@RequestMapping("login")
	public String s3() {
		return "Login";
	}
}