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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWindow frame = new UserWindow();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserWindow() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Bienvenido!!");
		lblTitulo.setBounds(288, 28, 292, 32);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setForeground(new Color(0, 0, 0));
		contentPane.add(lblTitulo);
		
		JButton btnVerRooms = new JButton("HABITACIONES");
		btnVerRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerRooms.setBounds(52, 118, 141, 37);
		contentPane.add(btnVerRooms);
		
		JButton btnImprimirTicket = new JButton("RESERVAR");
		btnImprimirTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaReserva();
			}
		});
		btnImprimirTicket.setBounds(459, 118, 141, 37);
		contentPane.add(btnImprimirTicket);
		
		JButton btnContacto = new JButton("CONTACTANOS");
		btnContacto.setBounds(269, 250, 116, 37);
		contentPane.add(btnContacto);
		
		JButton btnExit = new JButton("Back");
		btnExit.setBounds(542, 356, 110, 32);
		contentPane.add(btnExit);
	}
	
}
