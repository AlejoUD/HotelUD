package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tEmail;
	private JTextField tContrasenya;
	private JButton btnBack;
	private JButton btnLogin;
	String emailAdmin = "admin@admin.com";
	String passAdmin = "12345678";
	BBDD baseDatos = new BBDD();
	
	public LoginWindow() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lTitle = new JLabel("LOGIN");
		lTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lTitle.setForeground(new Color(0, 0, 0));
		lTitle.setBounds(155, 54, 291, 25);
		contentPane.add(lTitle);
		
		JLabel lEmail = new JLabel("User: ");
		lEmail.setBounds(89, 134, 87, 19);
		contentPane.add(lEmail);
		
		JLabel lContrasenya = new JLabel("Password: ");
		lContrasenya.setBounds(89, 177, 87, 19);
		contentPane.add(lContrasenya);
		
		tEmail = new JTextField();
		tEmail.setBounds(186, 133, 194, 20);
		contentPane.add(tEmail);
		tEmail.setColumns(10);
		
		tContrasenya = new JTextField();
		tContrasenya.setColumns(10);
		tContrasenya.setBounds(186, 176, 194, 20);
		contentPane.add(tContrasenya);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StartWindow();
				dispose();
			}
		});
		btnBack.setBounds(291, 241, 89, 23);
		contentPane.add(btnBack);
		
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tEmail.getText().equals(emailAdmin) && tContrasenya.getText().equals(passAdmin)) {
					new MenuAdminWindow();
					dispose();
				}
				else if (usuarioCoincide()== true) {
					new UserWindow();
					dispose();
				}else if (dependienteCoincide()==true) {
					//new DependientWindow();
					dispose();
				}
			}
		});
		btnLogin.setBounds(186, 241, 89, 23);
		contentPane.add(btnLogin);
	}
	public boolean usuarioCoincide() {
		ArrayList<User> userBD = new ArrayList<>();
		boolean result = false;
		for (User u : baseDatos.getUsers()) {
			if(tEmail.getText().equals(u.getDni()) && tContrasenya.getText().equals(u.getPassword())){
				result = true;
			
		}
		}
		return result;
	}
	public boolean dependienteCoincide() {
		ArrayList<Dependient> dependientBD = new ArrayList<>();
		boolean result = false;
		for (Dependient u : baseDatos.getDependients()) {
			if(tEmail.getText().equals(u.getDni()) && tContrasenya.getText().equals(u.getPassword())){
				result = true;
			
		}
		}
		return result;
	}
}
