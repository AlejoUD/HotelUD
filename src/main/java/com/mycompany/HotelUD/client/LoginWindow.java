package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tEmail;
	private JPasswordField tContrasenya;
	private JButton btnBack;
	private JButton btnLogin;
	String emailAdmin = "admin@admin.com";
	String passAdmin = "12345678";
	BBDD baseDatos = new BBDD();
	String texto;
	
	public LoginWindow() {
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 337);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lTitle = new JLabel("LOG IN");
		lTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lTitle.setForeground(Color.WHITE);
		lTitle.setBounds(205, 44, 66, 25);
		contentPane.add(lTitle);
		
		JLabel lEmail = new JLabel("User: ");
		lEmail.setForeground(Color.WHITE);
		lEmail.setBounds(55, 100, 87, 19);
		contentPane.add(lEmail);
		
		JLabel lContrasenya = new JLabel("Password: ");
		lContrasenya.setForeground(Color.WHITE);
		lContrasenya.setBounds(55, 146, 87, 19);
		contentPane.add(lContrasenya);
		
		tEmail = new JTextField();
		tEmail.setBounds(170, 99, 194, 20);
		contentPane.add(tEmail);
		tEmail.setColumns(10);
		
		tContrasenya = new JPasswordField();
		tContrasenya.setColumns(10);
		tContrasenya.setBounds(170, 145, 194, 20);
		contentPane.add(tContrasenya);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 221, 432, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.setBounds(72, 31, 82, 23);
		panel.add(btnLogin);
		
		btnBack = new JButton("Back");
		btnBack.setBackground(Color.ORANGE);
		btnBack.setBounds(296, 31, 89, 23);
		panel.add(btnBack);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon("..\\HotelUD\\lib\\eye.png"));
		btnNewButton.setBounds(368, 146, 35, 19);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(new ImageIcon("..\\HotelUD\\lib\\noLook.jpg"));
		btnNewButton_1.setBounds(407, 146, 35, 19);
		btnNewButton_1.setEnabled(false);
		contentPane.add(btnNewButton_1);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					 tContrasenya.setEchoChar((char) 0);
					 btnNewButton.setEnabled(false);
					 btnNewButton_1.setEnabled(true);
			
					 
					
			}
			
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					 tContrasenya.setEchoChar('*');
					 btnNewButton_1.setEnabled(false);
					 btnNewButton.setEnabled(true);
			}
			
		});
		
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StartWindow startWindow = new StartWindow();
				startWindow.setVisible(true);
				dispose();
				
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tEmail.getText().equals(emailAdmin) && tContrasenya.getText().equals(passAdmin)) {
					new MenuAdminWindow();
					dispose();
				}
				else if (usuarioCoincide()== true) {
					texto = tEmail.getText();
					new UserWindow(texto);
					dispose();
				}else if (dependienteCoincide()==true) {
					new DependientWindow();
					dispose();
				}
			}
		});
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
