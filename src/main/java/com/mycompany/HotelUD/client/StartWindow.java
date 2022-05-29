package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.log4j.Logger;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.server.HotelManager;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class StartWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private Client client;
	private WebTarget webTarget;
	private Thread thread;
	private final AtomicBoolean running = new AtomicBoolean(false);
	private static Logger logJava = Logger.getLogger(StartWindow.class);

	
	public static void main(String[] args) {
					String hostname = "127.0.0.1";
					String port = "8080";
					
					StartWindow frame = new StartWindow();
					frame.setVisible(true);
	}

	/**
	 * Crea la ventana y muestra el login.
	 * @return 
	 */
	
	public StartWindow() {
		
		client = ClientBuilder.newClient();
		webTarget = client.target(String.format("http://%s:%s/rest", "127.0.0.1","8080"));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setLayout(null);
		ImageIcon imagen = new ImageIcon("images\\Perfil.png");
		
		JButton btnLogin = new JButton("Login Admin");
		btnLogin.setBackground(Color.ORANGE);
		btnLogin.setBounds(129, 145, 139, 23);
		contentPane.add(btnLogin);

		JButton btnLoginUser = new JButton("Login User");
		btnLoginUser.setBackground(Color.ORANGE);
		btnLoginUser.setBounds(129, 179, 139, 23);
		contentPane.add(btnLoginUser);
		
		
		JButton btnRegistrarClient = new JButton("Register");
		btnRegistrarClient.setBackground(Color.ORANGE);
		btnRegistrarClient.setBounds(129, 213, 139, 23);
		contentPane.add(btnRegistrarClient);
		
		JButton btnLoginDependiente = new JButton("Login Dependient");
		btnLoginDependiente.setBackground(Color.ORANGE);
		btnLoginDependiente.setBounds(129, 247, 139, 23);
		contentPane.add(btnLoginDependiente);
		
		JLabel lblNombre = new JLabel("HOTEL UD");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setBounds(143, 38, 112, 50);
		contentPane.add(lblNombre);
		
		
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
				dispose();
			}
			
		});
		

		btnLoginUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
				dispose();
			}
			
		});
		
		btnLoginDependiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
			}
		});
		
		
		btnRegistrarClient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RegisterClientsWindow();
			}
			
		});
	}
	
	public void run() {
		running.set(true);
		while(running.get()) {
			try { 
				Thread.sleep(2000);
				logJava.info( "Obtaining data from server.");
			} catch (InterruptedException e){ 
				Thread.currentThread().interrupt();
				 logJava.error("Failed to complete operation");
			}
		}
	}
	public void stop() {
		this.running.set(false);
	}
}
