package com.betaben.animalactivity;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck();
		Fish fish = new Fish();
		Seal seal = new Seal();
		System.out.println("Duck says: "+duck.say());
		System.out.println("Fish says: "+fish.say());
		System.out.println("Seal says: "+seal.say());
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(duck);
		animals.add(fish);
		animals.add(seal);
		
		for(int i=0; i<animals.size(); i++){
			System.out.println(animal[i]);
		}
		
	}

}
