package com.betaben.animalactivity;

public class Duck extends Animal implements Fun, Fly, Swim {

	@Override
	public String say() {
		return("quack");
	}
	
	@Override
	public String play() {
		return("The duck likes to eat bread.");
	}
	
	@Override
	public String fly(){
		return("The duck can fly.");
	}
	
	@Override
	public String swim(){
		return("The duck can swim.");
	}
	
}
