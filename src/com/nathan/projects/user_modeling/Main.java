package com.nathan.projects.user_modeling;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtPassword;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipcode;
	private JTextField txtItem;
	private JTextField txtQuanity;
	private JTextField txtCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateAUser = new JLabel("Create An Order");
		lblCreateAUser.setBounds(232, 10, 86, 14);
		frame.getContentPane().add(lblCreateAUser);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(88, 36, 86, 20);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(88, 70, 86, 20);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(88, 101, 86, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(88, 132, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(88, 163, 86, 20);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setBounds(88, 194, 86, 20);
		frame.getContentPane().add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setBounds(88, 225, 86, 20);
		frame.getContentPane().add(txtState);
		txtState.setColumns(10);
		
		txtZipcode = new JTextField();
		txtZipcode.setBounds(88, 256, 86, 20);
		frame.getContentPane().add(txtZipcode);
		txtZipcode.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(27, 39, 51, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(28, 73, 50, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(54, 104, 24, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 135, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(39, 166, 39, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(59, 197, 19, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(50, 228, 28, 14);
		frame.getContentPane().add(lblState);
		
		JLabel lblZipcode = new JLabel("Zipcode");
		lblZipcode.setBounds(39, 259, 39, 14);
		frame.getContentPane().add(lblZipcode);
		
		txtItem = new JTextField();
		txtItem.setBounds(336, 50, 86, 20);
		frame.getContentPane().add(txtItem);
		txtItem.setColumns(10);
		
		txtQuanity = new JTextField();
		txtQuanity.setBounds(336, 81, 86, 20);
		frame.getContentPane().add(txtQuanity);
		txtQuanity.setColumns(10);
		
		txtCost = new JTextField();
		txtCost.setBounds(336, 112, 86, 20);
		frame.getContentPane().add(txtCost);
		txtCost.setColumns(10);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(294, 53, 24, 14);
		frame.getContentPane().add(lblItem);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(276, 84, 42, 14);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(296, 115, 22, 14);
		frame.getContentPane().add(lblCost);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User u = new User();
				u.setFirstName(txtFirstName.toString());
				u.setLastName(txtLastName.toString());
				u.setEmail(txtEmail.toString());
				u.setPassword(txtPassword.toString());
			}
		});
		btnPlaceOrder.setBounds(232, 193, 89, 23);
		frame.getContentPane().add(btnPlaceOrder);
	}
}
