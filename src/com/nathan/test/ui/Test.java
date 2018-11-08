package com.nathan.test.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.nathan.week2.hw.Car;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Test {

	private JFrame frmIHaveA;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frmIHaveA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIHaveA = new JFrame();
		frmIHaveA.setTitle("I Have A Title!");
		frmIHaveA.setBounds(100, 100, 450, 300);
		frmIHaveA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIHaveA.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 25, 86, 20);
		frmIHaveA.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("PRESS ME!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String message = "hello";
				textField.setText(message);
			}
		});
		btnNewButton.setBounds(28, 68, 111, 23);
		frmIHaveA.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Random Label");
		lblNewLabel.setBounds(28, 11, 86, 14);
		frmIHaveA.getContentPane().add(lblNewLabel);
	}
}
