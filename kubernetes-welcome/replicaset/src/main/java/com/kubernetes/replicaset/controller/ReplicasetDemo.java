package com.kubernetes.replicaset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplicasetDemo {
	
	@Autowired
	Environment env;
	
	@GetMapping("/")
	public String displayWelcomeMessage() {
		
		return "Welcome to Kubernetes Training - " + System.getenv("HOSTNAME");
	}

}
