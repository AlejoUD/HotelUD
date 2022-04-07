package com.mycompany.HotelUD.client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateWorkerWindow extends JFrame {

	private JPanel panelPrincipal;
	private JTextField nameField;
	private JTextField dniField;
	private JTextField ageField;
	private JTextField genderField;
	private java.sql.Connection conexion;

	
	public CreateWorkerWindow() {
		setTitle("Create new worker");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBounds(10, 11, 414, 30);
		panelPrincipal.add(TitlePanel);
		
		JLabel lblNewLabel = new JLabel("Create new worker");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TitlePanel.add(lblNewLabel);
		
		JPanel InformationPanel = new JPanel();
		InformationPanel.setBounds(10, 52, 414, 150);
		panelPrincipal.add(InformationPanel);
		InformationPanel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel nameLabel = new JLabel("Name");
		InformationPanel.add(nameLabel);
		
		nameField = new JTextField();
		InformationPanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel dniLabel = new JLabel("DNI");
		InformationPanel.add(dniLabel);
		
		dniField = new JTextField();
		InformationPanel.add(dniField);
		dniField.setColumns(10);
		
		JLabel genderLabel = new JLabel("Gender");
		InformationPanel.add(genderLabel);
		
		genderField = new JTextField();
		InformationPanel.add(genderField);
		genderField.setColumns(10);
		
		JLabel ageLabel = new JLabel("Age");
		InformationPanel.add(ageLabel);
		
		ageField = new JTextField();
		InformationPanel.add(ageField);
		ageField.setColumns(10);
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBounds(10, 213, 414, 37);
		panelPrincipal.add(ButtonPanel);
		
		JButton createWorkerButton = new JButton("Create Worker");
		ButtonPanel.add(createWorkerButton);
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
			System.out.println( "Successfully connected to the database");
		} catch (SQLException e) {
			System.out.println("Error connecting to database ");
			e.printStackTrace();
		}
		
		createWorkerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String name= nameField.getText();
					String dni = dniField.getText();
					String gender = genderField.getText();
					int age = Integer.parseInt(ageField.getText());
					
					String query = "INSERT INTO workers (name, dni, gender, age) values( '"+name+"','"+dni+"','"+gender+"','"+age+"')";
					
					Statement stmt = conexion.createStatement();
					stmt.execute(query);
					
					JOptionPane.showMessageDialog(null, "Product added successfully");
					
					nameField.setText("");
					dniField.setText("");
					genderField.setText("");
					ageField.setText("");

							
				}catch (SQLException e) {
					System.out.println("Error entering data into the database");
					e.printStackTrace();
				}
				
			}
		});
			
	}
	
	
}
