package com.kce.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Welcome {
 
	@RequestMapping(value="/Welcome",method=RequestMethod.GET)
	public String printwelcome(Map<String,String>map) {
		map.put("msg","WELCOME");
		return "Welcome";
	}
	
}
