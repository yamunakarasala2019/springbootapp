package com.javatalent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private final SpringBootExample engine;
	
	@Autowired
	public Car(SpringBootExample engine) {
		this.engine=engine;
	}
	public void start() {
		engine.run();
	}
	

}
