package com.greeting.main.services;

import org.springframework.stereotype.Service;

import com.greeting.main.model.Greeting;
import com.greeting.main.model.User;
@Service
public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(Long id);
}
