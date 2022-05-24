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
import java.text.SimpleDateFormat;
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

	/**
	 * Método para crear la ventana que visualiza las habitaciones.
	 */
	public ViewRoomsWindow() {
		setTitle("Habitaciones libres y habitaciones ocupadas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 724, 411);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.DARK_GRAY);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel PanelTitulo = new JPanel();
		PanelTitulo.setBackground(Color.DARK_GRAY);
		PanelPrincipal.add(PanelTitulo, BorderLayout.NORTH);
		
		JLabel lTitulo = new JLabel("Lista de habitaciones libres y ocupadas");
		lTitulo.setForeground(Color.WHITE);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		PanelTitulo.add(lTitulo);
		
		JPanel PanelInfo = new JPanel();
		PanelInfo.setBackground(Color.DARK_GRAY);
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
		JList listaAsigRooms = new JList<AsigRoom>(modelAsigRooms);
		
		scrollPaneUsers.setViewportView(listaAsigRooms);
	
		scrollPaneUsers.setBorder(new LineBorder(new Color(0, 0, 0)));
		PanelInfo.add(scrollPaneUsers);
		
		JPanel PanelBotones = new JPanel();
		PanelBotones.setBackground(Color.DARK_GRAY);
		PanelPrincipal.add(PanelBotones, BorderLayout.SOUTH);
		
		JToggleButton botonAsignar = new JToggleButton("DESASIGNAR HABITACION");
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
		
		ArrayList<AsigRoom> listaTempAsigRooms = baseDatos.getAsigRooms();
		
		for (int i = 0; i < listaTempAsigRooms.size(); i++) {
			
			modelAsigRooms.addElement(listaTempAsigRooms.get(i));
			
		}
		
		botonAsignar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AsigRoom Asigroom3 = (AsigRoom) listaAsigRooms.getSelectedValue();
				
				Room room3 = Asigroom3.getRoom();
				
				Integer number = room3.getNumberDoor();
				String type = room3.getType();
				int surface = room3.getSurface();
				int floor = room3.getFloor();
				String ocupation = "No";
		
				//modelRoom.addElement(v);
				//al.add(v);
				
				String query = "INSERT INTO room (numberDoor, type, surface, floor, ocupation) values( '"+number+"','"+type+"','"+surface+"','"+floor+"','"+ocupation+"')";
				
				Statement stmt;
				try {
					stmt = conexion.createStatement();
					stmt.execute(query);
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String query2 = "DELETE FROM roomAsig WHERE numberDoor = '"+number+"'";
				
				Statement stmt2;
				try {
					stmt2 = conexion.createStatement();
					stmt2.execute(query2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Habitacion desasignada correctamente.");
				
				
				
				
			}
		});

		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewRoomsWindow v1 = new ViewRoomsWindow();
	}
	

}

