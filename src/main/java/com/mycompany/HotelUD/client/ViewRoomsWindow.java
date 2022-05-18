package com.mycompany.HotelUD.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.AsigRoom;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;

import java.awt.Color;

public class ViewRoomsWindow extends JFrame {

	private JPanel PanelPrincipal;
	private JTable TablaClientes;
	private JTable TablaHabitaciones;
	private java.sql.Connection conexion;
	BBDD baseDatos = new BBDD();


	public ViewRoomsWindow() {
		setTitle("Habitaciones libres y habitaciones ocupadas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 724, 411);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel PanelTitulo = new JPanel();
		PanelPrincipal.add(PanelTitulo, BorderLayout.NORTH);
		
		JLabel lTitulo = new JLabel("Lista de habitaciones libres y ocupadas");
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PanelTitulo.add(lTitulo);
		
		JPanel PanelInfo = new JPanel();
		PanelPrincipal.add(PanelInfo, BorderLayout.CENTER);
		PanelInfo.setLayout(new GridLayout(1, 2, 0, 0));
		
		JScrollPane scrollPaneRooms = new JScrollPane();
		DefaultListModel<Room> modelRoom = new DefaultListModel<Room>();
		JList listaRooms = new JList<Room>(modelRoom);
		
		scrollPaneRooms.setViewportView(listaRooms);
		
		scrollPaneRooms.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(scrollPaneRooms);
		
		JScrollPane scrollPaneUsers = new JScrollPane();
		DefaultListModel<AsigRoom> modelAsigRooms = new DefaultListModel<AsigRoom>();
		JList listaUsers = new JList<AsigRoom>(modelAsigRooms);
		
		scrollPaneUsers.setViewportView(listaUsers);
		
		scrollPaneUsers.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(scrollPaneUsers);
		
		JPanel PanelBotones = new JPanel();
		PanelPrincipal.add(PanelBotones, BorderLayout.SOUTH);
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
			System.out.println( "Successfully connected to the database");
		} catch (SQLException e) {
			System.out.println("Error connecting to database ");
			e.printStackTrace();
		}
		
		ArrayList<Room> listaTempRooms = baseDatos.getRooms();
		
		for (int i = 0; i < listaTempRooms.size(); i++) {
			
			modelRoom.addElement(listaTempRooms.get(i));
			
		}
		
		ArrayList<AsigRoom> listaTempAsigRooms = baseDatos.getAsigRooms();
		
		for (int i = 0; i < listaTempAsigRooms.size(); i++) {
			
			modelAsigRooms.addElement(listaTempAsigRooms.get(i));
			
		}

		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewRoomsWindow v1 = new ViewRoomsWindow();
	}
	

}
