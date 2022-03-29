package main.java.es.deusto.spq;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegisterClientsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField dniField;
	private JTextField genderField;
	private JTextField ageField;
	private JTextField bankAccountField;

	
	public RegisterClientsWindow() {
		setTitle("Register new client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel TitlePanel = new JPanel();
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
		
		JLabel surnameLabel = new JLabel("Surname");
		InformationPanel.add(surnameLabel);
		
		surnameField = new JTextField();
		InformationPanel.add(surnameField);
		surnameField.setColumns(10);
		
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
		ButtonPanel.setBounds(10, 222, 414, 28);
		contentPane.add(ButtonPanel);
		
		JButton registerClientButton = new JButton("Register Client");
		ButtonPanel.add(registerClientButton);
	}

}
