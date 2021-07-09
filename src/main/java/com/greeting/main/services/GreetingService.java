package com.greeting.main.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greeting.main.Repository.GreetingRepository;
import com.greeting.main.model.Greeting;
import com.greeting.main.model.User;
@Service
public class GreetingService implements IGreetingService{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired(required = true)
	private GreetingRepository greetingRepository;
	
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template,(user.toString().isEmpty())?"Hello World" :user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
	}

	@Override
	public Greeting getGreetingById(Long id) {
		return greetingRepository.findById(id).get();
	}

	@Override
	public List<Greeting> getAllGreetings() {
		return greetingRepository.findAll();
	}

	@Override
	public String deleteGreeting(Long id) {
		greetingRepository.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Greeting updateGreeting(Long id, String message) {
		Greeting greet = this.getGreetingById(id);
		greet.setMessage(message);
		greetingRepository.save(greet);
		return this.getGreetingById(id);
	}
	
}
