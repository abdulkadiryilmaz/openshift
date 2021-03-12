package com.cosighter.openshift.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("api/resourcea")
	public String getResoure() {
		return "resourcea";
	}
	
}
