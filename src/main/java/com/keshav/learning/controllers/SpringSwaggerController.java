package com.keshav.learning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "SpringSwaggerController", description = "REST Apis related to anything!!!!")
@RestController
public class SpringSwaggerController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/keshavLearnings")
	public String sayHello() {
		return "Swagger Hello World";
	}

}
