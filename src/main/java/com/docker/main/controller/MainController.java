package com.docker.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/main")
	public String mainFunc() {
		return "Ola";
	}
}
