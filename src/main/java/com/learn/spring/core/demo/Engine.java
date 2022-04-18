package com.learn.spring.core.demo;

public class Engine {
	private String name;
	// Constructors, Getters and Setters

	public void start() {
		System.out.println("Engine started");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}