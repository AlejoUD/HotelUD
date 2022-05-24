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
import javax.swing.JComboBox;

public class MenuAdminWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Crea la ventana y muestra el menú principal que visualizarán los administradores y los dependientes del hotel.
	 */
	public MenuAdminWindow() {
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 378);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lMenuPrinc = new JLabel("MENU PRINCIPAL ADMINISTRADOR");
		lMenuPrinc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lMenuPrinc.setForeground(Color.WHITE);
		lMenuPrinc.setBounds(149, 64, 315, 25);
		contentPane.add(lMenuPrinc);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginWindow();
				dispose();
			}
		});
		btnBack.setBounds(455, 288, 89, 23);
		btnBack.setBackground(Color.ORANGE);
		contentPane.add(btnBack);

		JButton btnCreateClient = new JButton("Create Client");
		btnCreateClient.setBounds(32, 141, 119, 33);
		btnCreateClient.setBackground(Color.ORANGE);
		contentPane.add(btnCreateClient);
		btnCreateClient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RegisterClientsWindow();
			}
		});

		JButton btnCreateDependient = new JButton("Create Dependient");
		btnCreateDependient.setBounds(186, 141, 177, 33);
		btnCreateDependient.setBackground(Color.ORANGE);
		contentPane.add(btnCreateDependient);
		btnCreateDependient.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateDependientsWindow();
				dispose();
			}
		});

		JButton btnCreateWorker = new JButton("Create Worker");
		btnCreateWorker.setBounds(406, 141, 119, 33);
		btnCreateWorker.setBackground(Color.ORANGE);
		contentPane.add(btnCreateWorker);

		JButton btnCreateRoom = new JButton("Create Room");
		btnCreateRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RoomWindow();
			}
		});
		btnCreateRoom.setBounds(32, 203, 119, 33);
		btnCreateRoom.setBackground(Color.ORANGE);
		contentPane.add(btnCreateRoom);

		JButton btnReservas = new JButton("Bookings");
		btnReservas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReservaWindow(null);
			}
		});
		btnReservas.setBounds(186, 208, 177, 33);
		btnReservas.setBackground(Color.ORANGE);
		contentPane.add(btnReservas);
		btnCreateWorker.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateWorkerWindow();
			}
		});

		JButton btnCrearMenu = new JButton("Create Menu");
		btnCrearMenu.setBounds(406, 205, 119, 33);
		btnCrearMenu.setBackground(Color.ORANGE);
		contentPane.add(btnCrearMenu);
		btnCrearMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuRestauranteWindow();
				//dispose();
			}
		});
	}

}
