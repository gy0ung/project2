package com.kh.spring.support.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/support")
public class SupportController {

	@GetMapping("/support.vcr")
	public String support() {
		
		return "/support/vincero";
	}
}
