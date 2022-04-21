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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Room;

import java.awt.Color;

public class AsigClientRoomWindow extends JFrame {

	private JPanel PanelPrincipal;
	private JTable TablaClientes;
	private JTable TablaHabitaciones;
	private java.sql.Connection conexion;
	BBDD baseDatos = new BBDD();


	public AsigClientRoomWindow() {
		setTitle("Asignar Habitaciones a Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		DefaultTableModel modelRoom = new DefaultTableModel();
		
		TablaHabitaciones = new JTable(modelRoom);
		
		ArrayList<Room> listaRooms = baseDatos.getRooms();
		
		for (int i = 0; i < listaRooms.size(); i++) {
			
			modelRoom.addElement(listaRooms.get(i));
			
		}
		
		TablaHabitaciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		TablaHabitaciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		PanelInfo.add(TablaHabitaciones);
		
		DefaultTableModel modelClient = new DefaultTableModel();
		TablaClientes = new JTable(modelClient);
		
		TablaClientes.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(TablaClientes);
		
		JPanel PanelBotones = new JPanel();
		PanelPrincipal.add(PanelBotones, BorderLayout.SOUTH);
		
		JToggleButton botonAsignar = new JToggleButton("ASIGNAR HABITACIÓN");
		PanelBotones.add(botonAsignar);
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
			System.out.println( "Successfully connected to the database");
		} catch (SQLException e) {
			System.out.println("Error connecting to database ");
			e.printStackTrace();
		}
		
		
		
		setVisible(true);
	}
	
	

}
