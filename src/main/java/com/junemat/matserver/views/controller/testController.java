package com.junemat.matserver.views.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.junemat.matserver.views.service.testService;

@RestController
@RequestMapping("/test")
public class testController {
	
	@Autowired
	testService testservice;
	
	
	@PostMapping("/1")
//	@CrossOrigin(origins = "*")
	@ResponseBody
	public String home() {
		System.out.println("home home");
		testservice.stringService();
		return "HI";
	}
}
