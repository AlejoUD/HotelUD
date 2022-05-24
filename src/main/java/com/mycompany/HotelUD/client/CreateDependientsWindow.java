package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class CreateDependientsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField Nametxt;
	private JTextField dnitxt;
	private JTextField passwordtxt;
	private JTextField gendertxt;
	private JTextField positiontxt;
	private JTextField descriptiontxt;
	private JTextField banktxt;
	BBDD baseDatos = new BBDD();
	/**
	 * Lanza la ventana para crear nuevos dependientes en la base de datos.
	 */

	public CreateDependientsWindow() {
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 674, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear nuevo dependiente");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(122, 11, 208, 48);
		contentPane.add(lblTitulo);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(39, 102, 91, 22);
		contentPane.add(lblName);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDni.setBounds(39, 135, 91, 22);
		contentPane.add(lblDni);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(39, 168, 91, 22);
		contentPane.add(lblPassword);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGender.setBounds(39, 201, 91, 22);
		contentPane.add(lblGender);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setForeground(Color.WHITE);
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPosition.setBounds(39, 234, 91, 22);
		contentPane.add(lblPosition);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(39, 267, 91, 22);
		contentPane.add(lblDescription);
		
		JLabel lblBank = new JLabel("Bank Account:");
		lblBank.setForeground(Color.WHITE);
		lblBank.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBank.setBounds(39, 300, 91, 22);
		contentPane.add(lblBank);
		
		Nametxt = new JTextField();
		Nametxt.setBounds(177, 102, 158, 22);
		contentPane.add(Nametxt);
		Nametxt.setColumns(10);
		
		dnitxt = new JTextField();
		dnitxt.setColumns(10);
		dnitxt.setBounds(177, 135, 158, 22);
		contentPane.add(dnitxt);
		
		passwordtxt = new JTextField();
		passwordtxt.setColumns(10);
		passwordtxt.setBounds(177, 169, 158, 22);
		contentPane.add(passwordtxt);
		
		gendertxt = new JTextField();
		gendertxt.setColumns(10);
		gendertxt.setBounds(177, 201, 158, 22);
		contentPane.add(gendertxt);
		
		positiontxt = new JTextField();
		positiontxt.setColumns(10);
		positiontxt.setBounds(177, 235, 158, 22);
		contentPane.add(positiontxt);
		
		descriptiontxt = new JTextField();
		descriptiontxt.setColumns(10);
		descriptiontxt.setBounds(177, 268, 158, 22);
		contentPane.add(descriptiontxt);
		
		banktxt = new JTextField();
		banktxt.setColumns(10);
		banktxt.setBounds(177, 300, 158, 22);
		contentPane.add(banktxt);
		

		JButton btnback = new JButton("Back");
		btnback.setBounds(338, 364, 89, 23);
		contentPane.add(btnback);
		btnback.setBackground(Color.ORANGE);
		
		JButton btnRegistrar = new JButton("Register");
		btnRegistrar.setBounds(76, 363, 114, 24);
		contentPane.add(btnRegistrar);
		btnRegistrar.setBackground(Color.ORANGE);
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dependient dependient = new Dependient();
				String name= Nametxt.getText();
				String dni = dnitxt.getText();
				String pass= passwordtxt.getText();
				String gender = gendertxt.getText();
				String position = positiontxt.getText();
				String description = descriptiontxt.getText();
				String bankCount= banktxt.getText();
				
				dependient.setName(name);
				dependient.setDni(dni);
				dependient.setPassword(pass);
				dependient.setGender(gender);
				dependient.setPosition(position);
				dependient.setDescription(description);
				dependient.setBankAccount(bankCount);
				baseDatos.addDependient(dependient);
				
				JOptionPane.showMessageDialog(null, "Dependient added successfully");
				
				Nametxt.setText("");
				dnitxt.setText("");
				passwordtxt.setText("");
				gendertxt.setText("");
				positiontxt.setText("");
				descriptiontxt.setText("");
				banktxt.setText("");

			}
		});
		
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdminWindow MenuAdminWindow = new MenuAdminWindow();
				MenuAdminWindow.setVisible(true);
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAdminWindow();
				dispose();
			}
		});
	}
}
