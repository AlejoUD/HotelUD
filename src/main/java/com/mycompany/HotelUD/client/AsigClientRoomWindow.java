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
		
		JScrollPane scrollPaneRooms = new JScrollPane();
		DefaultListModel<Room> modelRoom = new DefaultListModel<Room>();
		JList listaRooms = new JList<Room>(modelRoom);
		
		scrollPaneRooms.setViewportView(listaRooms);
		
		scrollPaneRooms.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(scrollPaneRooms);
		
		JScrollPane scrollPaneUsers = new JScrollPane();
		DefaultListModel<User> modelUsers = new DefaultListModel<User>();
		JList listaUsers = new JList<User>(modelUsers);
		
		scrollPaneUsers.setViewportView(listaUsers);
		
		scrollPaneUsers.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(scrollPaneUsers);
		
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
		
		ArrayList<Room> listaTempRooms = baseDatos.getRooms();
		
		for (int i = 0; i < listaTempRooms.size(); i++) {
			
			modelRoom.addElement(listaTempRooms.get(i));
			
		}
		
		ArrayList<User> listaTempUsers = baseDatos.getUsers();
		
		for (int i = 0; i < listaTempUsers.size(); i++) {
			
			modelUsers.addElement(listaTempUsers.get(i));
			
		}
		
		botonAsignar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Room room3 = (Room) listaRooms.getSelectedValue();
				User user3 = (User) listaUsers.getSelectedValue();
				
				Integer number = room3.getNumberDoor();
				String type = room3.getType();
				int surface = room3.getSurface();
				int floor = room3.getFloor();
				String dni = user3.getDni();
				

				AsigRoom asigRoom = new AsigRoom(number, type, surface, floor, dni);
			
				//modelRoom.addElement(v);
				//al.add(v);
				
				String query = "INSERT INTO roomAsig (numberDoor, type, surface, floor, dni) values( '"+number+"','"+type+"','"+surface+"','"+floor+"','"+dni+"')";
				
				Statement stmt;
				try {
					stmt = conexion.createStatement();
					stmt.execute(query);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Habitación asignada correctamente.");
				
			}
		});
		
		
		
		setVisible(true);
	}
	
	

}
