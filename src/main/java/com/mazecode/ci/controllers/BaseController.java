package com.mazecode.ci.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BaseController {

	@GetMapping
	public String index() {
		return "Hello World";
	}
}
