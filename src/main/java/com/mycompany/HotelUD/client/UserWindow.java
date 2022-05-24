package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Ventana de usuarios que permite imprimir un ticket de la reserva realizada.
	 */
	public UserWindow(String texto) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 695, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bienvenido!!");
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setBounds(269, 26, 292, 32);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setForeground(Color.WHITE);
		contentPane.add(lblTitulo);
		
		JButton btnVerRooms = new JButton("HABITACIONES");
		btnVerRooms.setBackground(Color.ORANGE);
		btnVerRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewRoomsWindow();
			}
		});
		btnVerRooms.setBounds(52, 118, 141, 37);
		contentPane.add(btnVerRooms);
		
		JButton btnImprimirTicket = new JButton("RESERVAR");
		btnImprimirTicket.setBackground(Color.ORANGE);
		btnImprimirTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReservaWindow(texto);
			}
		});
		btnImprimirTicket.setBounds(459, 118, 141, 37);
		contentPane.add(btnImprimirTicket);
		
		JButton btnContacto = new JButton("CONTACTANOS");
		btnContacto.setBackground(Color.ORANGE);
		btnContacto.setBounds(269, 250, 130, 37);
		contentPane.add(btnContacto);
		
		btnContacto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginWindow();
				dispose();
			}
		});
		
		JButton btnExit = new JButton("Back");
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(542, 356, 110, 32);
		contentPane.add(btnExit);
	}
	
}