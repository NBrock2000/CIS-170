package com.nathan.projects.hangman_v2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmHangman;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmHangman.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHangman = new JFrame();
		frmHangman.setTitle("Hangman - by Nathan Brock");
		frmHangman.setBounds(100, 100, 690, 590);
		frmHangman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHangman.getContentPane().setLayout(null);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuess.setBounds(58, 92, 115, 29);
		frmHangman.getContentPane().add(btnGuess);
		
		textField = new JTextField();
		textField.setBounds(58, 63, 146, 26);
		frmHangman.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterAGuess = new JLabel("Enter A Guess Below:");
		lblEnterAGuess.setBounds(58, 38, 153, 20);
		frmHangman.getContentPane().add(lblEnterAGuess);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(387, 48, 252, 467);
		frmHangman.getContentPane().add(textArea);
		
		JLabel lblGuessesRemaining = new JLabel("Guesses Remaining");
		lblGuessesRemaining.setBounds(29, 394, 144, 20);
		frmHangman.getContentPane().add(lblGuessesRemaining);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 415, 146, 26);
		frmHangman.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
