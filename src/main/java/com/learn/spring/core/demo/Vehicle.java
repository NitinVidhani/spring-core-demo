package com.learn.spring.core.demo;

public class Vehicle {
	private String name;
	private Engine engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// Constructors, Getters and Setters
	public void drive() {
		engine.start();
		System.out.println(name + " is driving");
	}
}