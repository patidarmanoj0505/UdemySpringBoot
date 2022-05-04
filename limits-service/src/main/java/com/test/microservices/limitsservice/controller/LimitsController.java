package com.test.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservices.limitsservice.bean.Limits;

@RestController
public class LimitsController {
	@GetMapping("limits")
	public Limits retrievLimits() {
		return new Limits(1, 1000);
	}
}
