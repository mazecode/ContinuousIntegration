package com.mazecode.ci.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class BaseController {

	@GetMapping
	@ResponseBody
	public String index() {
		return "Hello World";
	}

	@GetMapping(value = "/greetings")
	@ResponseBody
	public String greeting(@PathVariable("greetings") String greeting) {
		return "Hello " + greeting;
	}
}

