package com.mycompany.HotelUD.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class StartWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow frame = new StartWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LPerfil = new JLabel();
		ImageIcon imagen = new ImageIcon("images\\Perfil.png");
		LPerfil.setIcon(imagen);
		LPerfil.setBounds(164, 47, 92, 87);
		contentPane.add(LPerfil);
		
		JButton btnLogin = new JButton("Login Admin");
		btnLogin.setBounds(129, 145, 139, 23);
		contentPane.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
				dispose();
			}
			
		});
		
		JButton btnLoginUser = new JButton("Login User");
		btnLoginUser.setBounds(129, 179, 139, 23);
		contentPane.add(btnLoginUser);
		
		btnLoginUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
				dispose();
			}
			
		});
		
		JButton btnRegistrarClient = new JButton("Register");
		btnRegistrarClient.setBounds(129, 213, 139, 23);
		contentPane.add(btnRegistrarClient);
		
		btnRegistrarClient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RegisterClientsWindow();
				dispose();
			}
			
		});
	}
}
