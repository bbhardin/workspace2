package com.betaben.collegeapp;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class FamilyMemberPanel extends JPanel {
	
	public FamilyMemberPanel(String firstName, String lastName, String age, String gpa) {
		
		setBackground(Color.WHITE);
		setBounds(0, 0, 188, 50);
		setVisible(true);
		
		JLabel lblFirstname = new JLabel(firstName);
		lblFirstname.setVisible(true);
		add(lblFirstname);
		
		JLabel lblLastName = new JLabel(lastName);
		lblLastName.setVisible(true);
		add(lblLastName);
		
		JLabel lblAge = new JLabel(age);
		lblAge.setVisible(true);
		add(lblAge);
		
		JLabel lblGpa = new JLabel(gpa);
		lblGpa.setVisible(true);
		add(lblGpa);
		
	}

}
