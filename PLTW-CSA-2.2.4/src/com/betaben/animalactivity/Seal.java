package com.betaben.animalactivity;

public class Seal extends Animal implements Fun, Fly, Swim {

	@Override
	public String say() {
		return("ort ort");
	}

	@Override
	public String play() {
		return("The seal bounces a ball off its nose.");
	}
	
	@Override
	public String fly(){
		return("The seal can't fly.");
	}
	
	@Override
	public String swim(){
		return("The seal can swim.");
	}
	
}
