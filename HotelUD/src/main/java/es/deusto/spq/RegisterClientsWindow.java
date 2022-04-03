package main.java.es.deusto.spq;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.junit.jupiter.params.converter.DefaultArgumentConverter;

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
	private JTextField surnameField;
	private JTextField dniField;
	private JTextField genderField;
	private JTextField ageField;
	private JTextField bankAccountField;
	private java.sql.Connection conexion;
	
	
	
	public RegisterClientsWindow() {
		
		setTitle("Register new client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 500, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
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
		ButtonPanel.setBounds(10, 222, 414, 280);
		contentPane.add(ButtonPanel);
		
		JButton registerClientButton = new JButton("Register Client");
		ButtonPanel.add(registerClientButton);
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
			System.out.println( "Successfully connected to the database");
		} catch (SQLException e) {
			System.out.println("Error connecting to database ");
			e.printStackTrace();
		}
		
		registerClientButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				
					String name= nameField.getText();
					String surname = surnameField.getText();
					String dni = dniField.getText();
					String gender = genderField.getText();
					int age = Integer.parseInt(ageField.getText());
					String bankAccount = bankAccountField.getText();
					
					String query = "INSERT INTO users (name, surname, dni, gender, age, bankCount) values( '"+name+"','"+surname+"','"+dni+"','"+gender+"','"+age+"','"+bankAccount+"')";
					
					Statement stmt = conexion.createStatement();
					stmt.execute(query);
					
					JOptionPane.showMessageDialog(null, "Product added successfully");
					
					nameField.setText("");
					surnameField.setText("");
					dniField.setText("");
					genderField.setText("");
					ageField.setText("");
					bankAccountField.setText("");
							
				}catch (SQLException e) {
					System.out.println("Error entering data into the database");
					e.printStackTrace();
				}
				
				
				
				
				
			}
			
		});
		
		
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterClientsWindow frame = new RegisterClientsWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
