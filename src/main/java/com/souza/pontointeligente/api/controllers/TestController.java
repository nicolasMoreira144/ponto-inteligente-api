package com.souza.pontointeligente.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test")
	public String exemplo() {
		return "Olá " + "Mlk doido";
	}

	@RequestMapping("/test2")
	public String exemplo2() {
		return "Olá " + "zica";
	}
}
