package com.greeting.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.main.model.Greeting;
import com.greeting.main.model.User;
import com.greeting.main.services.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping("")
	public Greeting greeting(@RequestParam(value="name",defaultValue="world") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
}
