package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class AsigClientRoomWindow extends JFrame {

	private JPanel PanelPrincipal;
	private JTable TablaClientes;
	private JTable TablaHabitaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsigClientRoomWindow frame = new AsigClientRoomWindow();
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
	public AsigClientRoomWindow() {
		setTitle("Asignar Habitaciones a Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 411);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel PanelTitulo = new JPanel();
		PanelPrincipal.add(PanelTitulo, BorderLayout.NORTH);
		
		JLabel lTitulo = new JLabel("Asignar Habitación a Cliente");
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PanelTitulo.add(lTitulo);
		
		JPanel PanelInfo = new JPanel();
		PanelPrincipal.add(PanelInfo, BorderLayout.CENTER);
		PanelInfo.setLayout(new GridLayout(1, 2, 0, 0));
		
		TablaHabitaciones = new JTable();
		TablaHabitaciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		TablaHabitaciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		PanelInfo.add(TablaHabitaciones);
		
		TablaClientes = new JTable();
		TablaClientes.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(TablaClientes);
		
		JPanel PanelBotones = new JPanel();
		PanelPrincipal.add(PanelBotones, BorderLayout.SOUTH);
		
		JToggleButton botonAsignar = new JToggleButton("ASIGNAR HABITACIÓN");
		PanelBotones.add(botonAsignar);
	}

}
