package com.example.docker.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/docker")
public class Controllerss {

	@GetMapping("/home")
	public @ResponseBody String home() {
		return "THIS IS HOME PAGE";
	}
}
