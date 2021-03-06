package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegisterClientsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField password;
	private JTextField dniField;
	private JTextField genderField;
	private JTextField ageField;
	private JTextField bankAccountField;
	BBDD baseDatos = new BBDD();
	
	/**
	 * Crea la ventana y permite crear nuevos clientes.
	 */
	
	public RegisterClientsWindow() {
		setResizable(false);
		setTitle("Register new client");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setBounds(150, 150, 465, 340);
		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBackground(Color.WHITE);
		TitlePanel.setBounds(10, 11, 414, 34);
		contentPane.add(TitlePanel);
		
		JLabel lblNewLabel = new JLabel("Register new client");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		TitlePanel.add(lblNewLabel);
		
		JPanel InformationPanel = new JPanel();
		InformationPanel.setBounds(10, 56, 414, 155);
		contentPane.add(InformationPanel);
		InformationPanel.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel nameLabel = new JLabel("Name");
		InformationPanel.add(nameLabel);
		
		nameField = new JTextField();
		InformationPanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		InformationPanel.add(passwordLabel);
		
		password = new JTextField();
		InformationPanel.add(password);
		password.setColumns(10);
		
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
		
		JLabel bankAccountLabel = new JLabel("Bank Account");
		InformationPanel.add(bankAccountLabel);
		
		bankAccountField = new JTextField();
		InformationPanel.add(bankAccountField);
		bankAccountField.setColumns(10);
		
	
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBackground(Color.WHITE);
		ButtonPanel.setBounds(10, 222, 414, 43);
		contentPane.add(ButtonPanel);
		
		JButton registerClientButton = new JButton("Register Client");
		registerClientButton.setBackground(Color.ORANGE);
		ButtonPanel.add(registerClientButton);
		
		JButton btnCancelar = new JButton("BACK");
		btnCancelar.setBackground(Color.ORANGE);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		ButtonPanel.add(btnCancelar);
		
		
		registerClientButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				User user = new User();
				String name= nameField.getText();
				String pass= password.getText();
				String dni = dniField.getText();
				String gender = genderField.getText();
				int age = Integer.parseInt(ageField.getText());
				String bankCount= bankAccountField.getText();
				
				user.setName(name);
				user.setPassword(pass);
				user.setDni(dni);
				user.setGender(gender);
				user.setAge(age);
				user.setBankCount(bankCount);
				baseDatos.addUsers(user);
				
				JOptionPane.showMessageDialog(null, "User added successfully");
				
				nameField.setText("");
				password.setText("");
				dniField.setText("");
				genderField.setText("");
				ageField.setText("");
				bankAccountField.setText("");
				dispose();

			}
			
		});
		
		
	}
}
