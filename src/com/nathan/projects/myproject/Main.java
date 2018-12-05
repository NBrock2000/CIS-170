package com.nathan.projects.myproject;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmEncoder;
	private JTextField txtSourceFile;
	private JTextField txtSourceMessage;
	private JTextField txtDestFile;
	private JTextField txtDestMessage;
	private JTextField txtSourceFile_2;
	private JTextField txtSourceMessage_2;
	private JTextField txtDestMessage_2;
	private JTextField txtDestFile_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Util u = new Util();
		u.init();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmEncoder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String getSM() {
		return txtSourceMessage.getText();
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
		frmEncoder = new JFrame();
		frmEncoder.setTitle("Encoder");
		frmEncoder.setBounds(100, 100, 834, 555);
		frmEncoder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEncoder.getContentPane().setLayout(null);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(169, 37, 46, 14);
		frmEncoder.getContentPane().add(lblSource);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(544, 37, 65, 14);
		frmEncoder.getContentPane().add(lblDestination);
		
		JRadioButton rdbtnFromFile = new JRadioButton("From file");
		rdbtnFromFile.setBounds(21, 54, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromFile);
		
		JRadioButton rdbtnFromTextBox = new JRadioButton("From text box");
		rdbtnFromTextBox.setBounds(21, 104, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromTextBox);
		rdbtnFromTextBox.setSelected(true);
		
		JRadioButton rdbtnToFile = new JRadioButton("To File");
		rdbtnToFile.setBounds(420, 54, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToFile);
		
		JRadioButton rdbtnToTextBox = new JRadioButton("To text box");
		rdbtnToTextBox.setBounds(420, 104, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToTextBox);
		rdbtnToTextBox.setSelected(true);
		
		JLabel lblEnterALocation = new JLabel("Enter a location");
		lblEnterALocation.setBounds(68, 84, 108, 14);
		frmEncoder.getContentPane().add(lblEnterALocation);
		
		JLabel lblEnterAMessage = new JLabel("Enter a message");
		lblEnterAMessage.setBounds(68, 134, 108, 14);
		frmEncoder.getContentPane().add(lblEnterAMessage);
		
		txtSourceFile = new JTextField();
		txtSourceFile.setBounds(169, 81, 164, 20);
		frmEncoder.getContentPane().add(txtSourceFile);
		txtSourceFile.setColumns(10);
		
		txtSourceMessage = new JTextField();
		txtSourceMessage.setBounds(169, 131, 164, 20);
		frmEncoder.getContentPane().add(txtSourceMessage);
		txtSourceMessage.setColumns(10);
		
		JLabel label = new JLabel("Enter a location");
		label.setBounds(463, 84, 108, 14);
		frmEncoder.getContentPane().add(label);
		
		txtDestFile = new JTextField();
		txtDestFile.setColumns(10);
		txtDestFile.setBounds(566, 81, 164, 20);
		frmEncoder.getContentPane().add(txtDestFile);
		
		JLabel lblEncodedMessage = new JLabel("Encoded message");
		lblEncodedMessage.setBounds(463, 134, 108, 14);
		frmEncoder.getContentPane().add(lblEncodedMessage);
		
		txtDestMessage = new JTextField();
		txtDestMessage.setColumns(10);
		txtDestMessage.setBounds(566, 131, 164, 20);
		frmEncoder.getContentPane().add(txtDestMessage);
		
		JLabel lblEncoder = new JLabel("Encoder");
		lblEncoder.setBounds(360, 11, 46, 14);
		frmEncoder.getContentPane().add(lblEncoder);
		
		JLabel label_2 = new JLabel("Enter a message");
		label_2.setBounds(68, 377, 108, 14);
		frmEncoder.getContentPane().add(label_2);
		
		JRadioButton rdbtnFromTextBox_2 = new JRadioButton("From text box");
		rdbtnFromTextBox_2.setSelected(true);
		rdbtnFromTextBox_2.setBounds(21, 347, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromTextBox_2);
		
		JLabel label_3 = new JLabel("Enter a location");
		label_3.setBounds(68, 327, 108, 14);
		frmEncoder.getContentPane().add(label_3);
		
		JRadioButton rdbtnFromFile_2 = new JRadioButton("From file");
		rdbtnFromFile_2.setBounds(21, 297, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromFile_2);
		
		JLabel label_4 = new JLabel("Source");
		label_4.setBounds(169, 280, 46, 14);
		frmEncoder.getContentPane().add(label_4);
		
		txtSourceFile_2 = new JTextField();
		txtSourceFile_2.setColumns(10);
		txtSourceFile_2.setBounds(169, 324, 164, 20);
		frmEncoder.getContentPane().add(txtSourceFile_2);
		
		txtSourceMessage_2 = new JTextField();
		txtSourceMessage_2.setColumns(10);
		txtSourceMessage_2.setBounds(169, 374, 164, 20);
		frmEncoder.getContentPane().add(txtSourceMessage_2);
		
		JRadioButton rdbtnToFile_2 = new JRadioButton("To File");
		rdbtnToFile_2.setBounds(420, 297, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToFile_2);
		
		JLabel label_5 = new JLabel("Enter a location");
		label_5.setBounds(463, 327, 108, 14);
		frmEncoder.getContentPane().add(label_5);
		
		JRadioButton rdbtnToTextBox_2 = new JRadioButton("To text box");
		rdbtnToTextBox_2.setSelected(true);
		rdbtnToTextBox_2.setBounds(420, 347, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToTextBox_2);
		
		JLabel lblDecodedMessage = new JLabel("Decoded message");
		lblDecodedMessage.setBounds(463, 377, 108, 14);
		frmEncoder.getContentPane().add(lblDecodedMessage);
		
		txtDestMessage_2 = new JTextField();
		txtDestMessage_2.setColumns(10);
		txtDestMessage_2.setBounds(566, 374, 164, 20);
		frmEncoder.getContentPane().add(txtDestMessage_2);
		
		txtDestFile_2 = new JTextField();
		txtDestFile_2.setColumns(10);
		txtDestFile_2.setBounds(566, 324, 164, 20);
		frmEncoder.getContentPane().add(txtDestFile_2);
		
		JLabel label_7 = new JLabel("Destination");
		label_7.setBounds(544, 280, 65, 14);
		frmEncoder.getContentPane().add(label_7);
		
		JLabel lblDecoder = new JLabel("Decoder");
		lblDecoder.setBounds(360, 254, 46, 14);
		frmEncoder.getContentPane().add(lblDecoder);

		ButtonGroup enSource = new ButtonGroup();
		enSource.add(rdbtnFromFile);
		enSource.add(rdbtnFromTextBox);
		
		ButtonGroup enDest = new ButtonGroup();
		enDest.add(rdbtnToFile);
		enDest.add(rdbtnToTextBox);
		
		ButtonGroup DeSource = new ButtonGroup();
		DeSource.add(rdbtnFromFile_2);
		DeSource.add(rdbtnFromTextBox_2);
		
		ButtonGroup DeDest = new ButtonGroup();
		DeDest.add(rdbtnToFile_2);
		DeDest.add(rdbtnToTextBox_2);
		
		JButton btnEncode = new JButton("Encode");
		btnEncode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Encode en = new Encode();
				if(rdbtnFromTextBox.isSelected() && rdbtnToTextBox.isSelected())
					if(!getSM().isEmpty()) {
						txtDestMessage.setText(en.encodeUItoUI());
					}
			}
		});
		btnEncode.setBounds(336, 162, 89, 23);
		frmEncoder.getContentPane().add(btnEncode);
		
		JButton btnDecode = new JButton("Decode");
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDecode.setBounds(336, 405, 89, 23);
		frmEncoder.getContentPane().add(btnDecode);
		
		
	}
}
