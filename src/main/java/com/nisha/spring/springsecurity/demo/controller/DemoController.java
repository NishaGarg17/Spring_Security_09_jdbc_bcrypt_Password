package com.nisha.spring.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String showLanding() {
		return "landing";
	}
	@GetMapping("/employees") 
	public String showHome() {
		return "home";
	}
	// request mapping for /leaders
	@GetMapping("/leaders") 
	public String showLeaders() {
		return "leaders";
	}
	// request mapping for /systems
	@GetMapping("/systems") 
	public String showSystems() {
		return "systems";
	}
}
