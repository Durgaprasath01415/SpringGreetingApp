package com.greeting.main.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="greetingapp")
public class Greeting {
	@Id
	private Long id;
	private String message;
	
	public Greeting(Long id, String message) {
		this.id=id;
		this.message=message;
	}

	public Greeting() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", message=" + message + "]";
	}
	
	
	
}
