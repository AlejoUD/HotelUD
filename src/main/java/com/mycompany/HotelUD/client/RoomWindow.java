package com.mycompany.HotelUD.client;

import static org.mockito.ArgumentMatchers.booleanThat;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTable;
import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Room;
import javax.swing.JTextField;

public class RoomWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	ArrayList<Room> al = new ArrayList<>();
	private java.sql.Connection conexion;
	BBDD baseDatos = new BBDD();
	

	public RoomWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 539, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("HABITACIONES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(Color.ORANGE);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, UIManager.getColor("List.selectionBackground"), null, null, null));
		panel_1.setBounds(251, 11, 252, 125);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 252, 125);
		panel_1.add(scrollPane);
		
		DefaultListModel<Room> modelRoom = new DefaultListModel<Room>();
		JList<Room> lista = new JList<Room>(modelRoom);
		
		scrollPane.setViewportView(lista);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, UIManager.getColor("List.selectionBackground"), null, null, null));
		panel_2.setBounds(0, 0, 229, 203);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_2 = new JLabel("Type");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 36, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Floor");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 61, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Surface");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 86, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 111, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 33, 80, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 58, 80, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 83, 80, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 108, 80, 20);
		panel_2.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(74, 154, 89, 23);
		panel_2.add(btnNewButton_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

						Room room = new Room();
						
						String type = (String) textField_1.getText();
						int surface = (int) Integer.parseInt(textField_2.getText());
						int floor = (int) Integer.parseInt(textField_3.getText());
						String ocupation = "No";
		
		
						room.setType(type);
						room.setSurface(surface);
						room.setFloor(floor);
						room.setOcupation(ocupation);
						baseDatos.addRoom(room);
						
						ArrayList<Room> listaRooms = baseDatos.getRooms();
						
						modelRoom.clear();
						for (int i = 0; i < listaRooms.size(); i++) {
							
							modelRoom.addElement(listaRooms.get(i));
							al.add(listaRooms.get(i));
							
						}
						
						
						JOptionPane.showMessageDialog(null, "Room added successfully");
						
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
							
						
			}
		});
		
		JButton btnNewButton_2 = new JButton("ASSIGN");
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AsigClientRoomWindow();
			}
		});
		
		btnNewButton_2.setBounds(261, 155, 89, 23);
		panel.add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBounds(414, 155, 89, 23);
		panel.add(btnNewButton_3);
		
		
		ArrayList<Room> listaRooms = baseDatos.getRooms();
		
		for (int i = 0; i < listaRooms.size(); i++) {
			
			modelRoom.addElement(listaRooms.get(i));
			
		}
		
	}
	
	
	
	
}
