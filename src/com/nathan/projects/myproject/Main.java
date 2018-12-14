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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmEncoder;
	private JTextField txtSourceMessage;
	private JTextField txtDestMessage;
	private JTextField txtSourceMessage_2;
	private JTextField txtDestMessage_2;

	private static Util u;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		u = new Util();
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
		
		JLabel lblEnterAMessage = new JLabel("Enter a message");
		lblEnterAMessage.setBounds(68, 134, 108, 14);
		frmEncoder.getContentPane().add(lblEnterAMessage);
		
		txtSourceMessage = new JTextField();
		txtSourceMessage.setBounds(169, 131, 164, 20);
		frmEncoder.getContentPane().add(txtSourceMessage);
		txtSourceMessage.setColumns(10);
		
		JLabel lblEncodedMessage = new JLabel("Encoded message");
		lblEncodedMessage.setBounds(463, 134, 108, 14);
		frmEncoder.getContentPane().add(lblEncodedMessage);
		
		txtDestMessage = new JTextField();
		txtDestMessage.setColumns(10);
		txtDestMessage.setBounds(570, 131, 164, 20);
		frmEncoder.getContentPane().add(txtDestMessage);
		
		JLabel lblEncoder = new JLabel("Encoder");
		lblEncoder.setBounds(360, 11, 54, 14);
		frmEncoder.getContentPane().add(lblEncoder);
		
		JLabel label_2 = new JLabel("Enter a message");
		label_2.setBounds(68, 377, 108, 14);
		frmEncoder.getContentPane().add(label_2);
		
		JRadioButton rdbtnFromTextBox_2 = new JRadioButton("From text box");
		rdbtnFromTextBox_2.setSelected(true);
		rdbtnFromTextBox_2.setBounds(21, 347, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromTextBox_2);
		
		JRadioButton rdbtnFromFile_2 = new JRadioButton("From file");
		rdbtnFromFile_2.setBounds(21, 297, 109, 23);
		frmEncoder.getContentPane().add(rdbtnFromFile_2);
		
		JLabel label_4 = new JLabel("Source");
		label_4.setBounds(169, 280, 46, 14);
		frmEncoder.getContentPane().add(label_4);
		
		txtSourceMessage_2 = new JTextField();
		txtSourceMessage_2.setColumns(10);
		txtSourceMessage_2.setBounds(169, 374, 164, 20);
		frmEncoder.getContentPane().add(txtSourceMessage_2);
		
		JRadioButton rdbtnToFile_2 = new JRadioButton("To File");
		rdbtnToFile_2.setBounds(420, 297, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToFile_2);
		
		JRadioButton rdbtnToTextBox_2 = new JRadioButton("To text box");
		rdbtnToTextBox_2.setSelected(true);
		rdbtnToTextBox_2.setBounds(420, 347, 109, 23);
		frmEncoder.getContentPane().add(rdbtnToTextBox_2);
		
		JLabel lblDecodedMessage = new JLabel("Decoded message");
		lblDecodedMessage.setBounds(463, 377, 108, 14);
		frmEncoder.getContentPane().add(lblDecodedMessage);
		
		txtDestMessage_2 = new JTextField();
		txtDestMessage_2.setColumns(10);
		txtDestMessage_2.setBounds(570, 374, 164, 20);
		frmEncoder.getContentPane().add(txtDestMessage_2);
		
		JLabel label_7 = new JLabel("Destination");
		label_7.setBounds(544, 280, 65, 14);
		frmEncoder.getContentPane().add(label_7);
		
		JLabel lblDecoder = new JLabel("Decoder");
		lblDecoder.setBounds(360, 254, 54, 14);
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
				// Text field to text field
				if(rdbtnFromTextBox.isSelected() && rdbtnToTextBox.isSelected()) {	
					String source = txtSourceMessage.getText();
					txtDestMessage.setText(null);
					if(source.length() > 1) {
						String[] s = source.split("");
						for(int i = 0; i < s.length; i++) {
								String k = u.key.getKey(s[i]);
								txtDestMessage.setText(txtDestMessage.getText() + k);
						}
					} else {
						String k = u.key.getKey(source);
						txtDestMessage.setText(k);
					}

				}
				
				// Text field to file
				else if(rdbtnFromTextBox.isSelected() && rdbtnToFile.isSelected()) {
					String source = txtSourceMessage.getText();
					try {
						BufferedWriter w = new BufferedWriter(new FileWriter("src/com/nathan/projects/myproject/EncodeOutput.txt"));
					    try {
					    	if(source.length() > 1) {

								String[] s = source.split("");
								for(int i = 0; i < s.length; i++) {
										String k = u.key.getKey(s[i]);
										w.write(k);
								}
							} else {
								String k = u.key.getKey(source);
								w.write(k);
							}
						} 
					    catch (IOException Ie) 
					    {
							Ie.printStackTrace();
						}
					    finally
					    {
					    	w.close();
					    }
					} catch (IOException Ie){
						Ie.printStackTrace();
					}
				}
				
				// File to File
				else if(rdbtnFromFile.isSelected() && rdbtnToFile.isSelected()) {
					File f = new File("src/com/nathan/projects/myproject/EncodeInput.txt");
					BufferedWriter w = null;
					// Check to see if file exists
					if(f.exists()) {
						try {
							BufferedReader br = new BufferedReader(new FileReader(f));
							w = new BufferedWriter(new FileWriter("src/com/nathan/projects/myproject/EncodeOutput.txt", true));
							String source;
							//read in file
							while((source = br.readLine()) != null) {
								if(source.length() > 1) {
									String[] s = source.split("");
									for(int i = 0; i < s.length; i++) {
											String k = u.key.getKey(s[i]);
											w.write(k);
									}
								} else {
									String k = u.key.getKey(source);
									w.write(k);
								}
							}
						} catch (IOException Ie){
							Ie.printStackTrace();
						}
						finally
						{
							try {
								w.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
						
					}
				}
				
				// file to text field
				else if(rdbtnFromFile.isSelected() && rdbtnToTextBox.isSelected()) {
					File f = new File("src/com/nathan/projects/myproject/EncodeInput.txt");
					// Check to see if file exists
					if(f.exists()) {
						try {
							BufferedReader br = new BufferedReader(new FileReader(f));
							String source;
							//read in file
							while((source = br.readLine()) != null) {
								if(source.length() > 1) {
									String[] s = source.split("");
									for(int i = 0; i < s.length; i++) {
											String k = u.key.getKey(s[i]);
											txtDestMessage.setText(txtDestMessage.getText() + k);
									}
								} else {
									String k = u.key.getKey(source);
									txtDestMessage.setText(k);
								}
							}
						} catch (IOException Ie){
							Ie.printStackTrace();
						}
						
						
					}
				}
			}
		});
		btnEncode.setBounds(336, 162, 89, 23);
		frmEncoder.getContentPane().add(btnEncode);
		
		JButton btnDecode = new JButton("Decode");
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// text field to text field
				if(rdbtnFromTextBox_2.isSelected() && rdbtnToTextBox_2.isSelected()) {
					String source = txtSourceMessage_2.getText();
					txtDestMessage_2.setText(null);
					if(source.length() == 8) {
						String a = u.key.get(source);
						txtDestMessage_2.setText(a);
					} else if (source.length() >= 8){
						String[] s = source.split("(?<=\\G........)");
						for(int i = 0; i < s.length; i ++) {
							String b = u.key.get(s[i]);
							txtDestMessage_2.setText(txtDestMessage_2.getText() + b);
						}
					}
				}
				
				// text field to file
				if(rdbtnFromTextBox_2.isSelected() && rdbtnToFile_2.isSelected()) {
					String source = txtSourceMessage_2.getText();
					txtDestMessage_2.setText(null);
					try {
						BufferedWriter w = new BufferedWriter(new FileWriter("src/com/nathan/projects/myproject/DecodeOutput.txt"));
					    try {
					    	if(source.length() == 8) {
								String a = u.key.get(source);
								w.write(a);
							} else if (source.length() >= 8){
								String[] s = source.split("(?<=\\G........)");
								for(int i = 0; i < s.length; i ++) {
									String b = u.key.get(s[i]);
									w.write(b);
								}
							}

						} 
					    catch (IOException Ie) 
					    {
							Ie.printStackTrace();
						}
					    finally
					    {
					    	w.close();
					    }
					} catch (IOException Ie){
						Ie.printStackTrace();
					}
				}
				
				// file to file
				else if(rdbtnFromFile_2.isSelected() && rdbtnToFile_2.isSelected()) {
					File f = new File("src/com/nathan/projects/myproject/DecodeInput.txt");
					BufferedWriter w = null;
					// Check to see if file exists
					if(f.exists()) {
						try {
							BufferedReader br = new BufferedReader(new FileReader(f));
							w = new BufferedWriter(new FileWriter("src/com/nathan/projects/myproject/DecodeOutput.txt", true));
							String source;
							//read in file
							while((source = br.readLine()) != null) {
								if(source.length() == 8) {
									String a = u.key.get(source);
									w.write(a);
								} else if (source.length() >= 8){
									String[] s = source.split("(?<=\\G........)");
									for(int i = 0; i < s.length; i ++) {
										String b = u.key.get(s[i]);
										w.write(b);
									}
								}
							}
						} catch (IOException Ie){
							Ie.printStackTrace();
						}
						finally
						{
							try {
								w.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
						
					}
				}
				
				// file to text field
				else if(rdbtnFromFile_2.isSelected() && rdbtnToTextBox_2.isSelected()) {
					File f = new File("src/com/nathan/projects/myproject/DecodeInput.txt");
					txtDestMessage_2.setText(null);
					// Check to see if file exists
					if(f.exists()) {
						try {
							BufferedReader br = new BufferedReader(new FileReader(f));
							String source;
							//read in file
							while((source = br.readLine()) != null) {
								if(source.length() == 8) {
									String a = u.key.get(source);
									txtDestMessage_2.setText(a);
								} else if (source.length() >= 8){
									String[] s = source.split("(?<=\\G........)");
									for(int i = 0; i < s.length; i ++) {
										String b = u.key.get(s[i]);
										txtDestMessage_2.setText(txtDestMessage_2.getText() + b);
									}	
								}
							}
						} catch (IOException Ie){
							Ie.printStackTrace();
						}
						
						
					}
				}
				
			}
		});
		btnDecode.setBounds(336, 405, 89, 23);
		frmEncoder.getContentPane().add(btnDecode);
		
		
	}
}
