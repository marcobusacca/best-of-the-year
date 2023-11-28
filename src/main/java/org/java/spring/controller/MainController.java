package org.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String page1(Model model) {
		
		String name = "Marco";
		
		model.addAttribute("name", name);
		
		return "page1";
	}
}
