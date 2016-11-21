package com.betaben.animalactivity;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck duck = new Duck();
		Fish fish = new Fish();
		Seal seal = new Seal();
		Fox fox = new Fox();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(duck);
		animals.add(fish);
		animals.add(seal);
		animals.add(fox);
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(620, 250);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JLabel display = new JLabel();
		display.setBounds(0, 100, frame.getWidth(), 100);
		display.setFont(new Font("SF Mono", Font.PLAIN, 36));
		display.setVisible(true);
		
		JButton duckButton = new JButton();
		duckButton.setText("Duck");
		duckButton.setBounds(10, 10, 150, 100);
		duckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(duck.say());
			}
		});
		duckButton.setVisible(true);
		
		JButton fishButton = new JButton();
		fishButton.setText("Fish");
		fishButton.setBounds(160, 10, 150, 100);
		fishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(fish.say());
			}
		});
		fishButton.setVisible(true);
		
		JButton sealButton = new JButton();
		sealButton.setText("Seal");
		sealButton.setBounds(310, 10, 150, 100);
		sealButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(seal.say());
			}
		});
		sealButton.setVisible(true);
		
		JButton foxButton = new JButton();
		foxButton.setText("Fox");
		foxButton.setBounds(460, 10, 150, 100);
		foxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(fox.say());
			}
		});
		foxButton.setVisible(true);
		
		for(Animal animal : animals){
			System.out.println("The " + animal.getClass().getSimpleName() + " says " + animal.say());
		}
	
		frame.add(duckButton);
		frame.add(fishButton);
		frame.add(sealButton);
		frame.add(foxButton);
		
		frame.add(display);
		
		frame.setVisible(true);
		
	}

}
