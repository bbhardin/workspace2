package com.betaben.collegeapp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTxt;
	private JTextField lastNameTxt;
	private JTextField ageTxt;
	private JTextField GPATxt;
	
	public String firstName;
	public String lastName;
	public String age;
	public String GPA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameTxt = new JTextField();
		firstNameTxt.setBounds(124, 6, 320, 30);
		contentPane.add(firstNameTxt);
		firstNameTxt.setColumns(10);
		
		lastNameTxt = new JTextField();
		lastNameTxt.setBounds(124, 42, 320, 30);
		contentPane.add(lastNameTxt);
		lastNameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(124, 78, 320, 30);
		contentPane.add(ageTxt);
		ageTxt.setColumns(10);
		
		GPATxt = new JTextField();
		GPATxt.setBounds(124, 114, 320, 30);
		contentPane.add(GPATxt);
		GPATxt.setColumns(10);
		
		JLabel firstNameLbl = new JLabel("First Name:");
		firstNameLbl.setBounds(6, 6, 215, 30);
		contentPane.add(firstNameLbl);
		
		JLabel lastNameLbl = new JLabel("Last Name:");
		lastNameLbl.setBounds(6, 42, 203, 30);
		contentPane.add(lastNameLbl);
		
		JLabel ageLbl = new JLabel("Age:");
		ageLbl.setBounds(6, 78, 203, 30);
		contentPane.add(ageLbl);
		
		JLabel GPALbl = new JLabel("GPA:");
		GPALbl.setBounds(6, 114, 203, 30);
		contentPane.add(GPALbl);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(6, 202, 438, 70);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				submit();
			}
		});
		
		contentPane.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==(KeyEvent.VK_ENTER)){
						submit();
				}
			}
			public void keyReleased(KeyEvent e){
				
			}
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					submit();
				}
			}
		});
		contentPane.add(submitBtn);
		
	}
	
	public void submit(){
		firstName = firstNameTxt.getText();
		lastName = lastNameTxt.getText();
		age = ageTxt.getText();
		GPA = GPATxt.getText();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + GPA);
	}
	
}
