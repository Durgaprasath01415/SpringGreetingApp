package com.greeting.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greeting.main.model.Greeting;
import com.greeting.main.model.User;
@Service
public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(Long id);
	List<Greeting> getAllGreetings();
	String deleteGreeting(Long id);
	Greeting updateGreeting(Long id, String message);
}
