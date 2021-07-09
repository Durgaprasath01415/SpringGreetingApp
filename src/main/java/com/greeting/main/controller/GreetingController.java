package com.greeting.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/")
	public Greeting greeting(@RequestParam(value="fname",defaultValue="world") String fname,
			@RequestParam(value = "lname", defaultValue = "")String lName) {
		User user = new User();
		user.setFirstName(fname);
		user.setLastName(lName);
		return greetingService.addGreeting(user);
	}
	@GetMapping("/{id}")
	public String getGreeting(@PathVariable Long id) {
		return greetingService.getGreetingById(id).getMessage();	
	}
	@GetMapping("/getAll")
	public List<Greeting> getAllGreeting() {
		return greetingService.getAllGreetings();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteGreeting(@PathVariable Long id) {
		return greetingService.deleteGreeting(id);
	}
	@PutMapping("/put")
	public Greeting updateGreeting(@RequestParam(value = "id") Long id,
			@RequestParam(value = "message", defaultValue = "")String message) {
		return greetingService.updateGreeting(id, message);		
	}	
}
