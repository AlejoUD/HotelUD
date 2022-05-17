package com.mycompany.HotelUD.client;

import static org.mockito.ArgumentMatchers.booleanThat;

import java.awt.BorderLayout;
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 539, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("HABITACIONES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("BACK");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
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
		JList lista = new JList<Room>(modelRoom);
		
		scrollPane.setViewportView(lista);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, UIManager.getColor("List.selectionBackground"), null, null, null));
		panel_2.setBounds(0, 0, 229, 203);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Room number");
		lblNewLabel_1.setBounds(10, 11, 119, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type");
		lblNewLabel_2.setBounds(10, 36, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Floor");
		lblNewLabel_3.setBounds(10, 61, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Surface");
		lblNewLabel_4.setBounds(10, 86, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setBounds(10, 111, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(139, 8, 80, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
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
		btnNewButton_1.setBounds(74, 154, 89, 23);
		panel_2.add(btnNewButton_1);
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
			System.out.println( "Successfully connected to the database");
		} catch (SQLException e) {
			System.out.println("Error connecting to database ");
			e.printStackTrace();
		}
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(btnNewButton_1, "Error. It is necessary to add a room number",
							"data creation", JOptionPane.ERROR_MESSAGE);
				} else {

					try {
						
						Integer number;
						String type;
						int surface;
						int floor;
						String ocupation;
		
						number = (int) Integer.parseInt(textField.getText());
						type = (String) textField_1.getText();
						surface = (int) Integer.parseInt(textField_2.getText());
						floor = (int) Integer.parseInt(textField_3.getText());
						ocupation = "No";
		
						Room v = new Room(number, type, surface, floor, ocupation);
					
						modelRoom.addElement(v);
						al.add(v);
						
						String query = "INSERT INTO room (numberDoor, type, surface, floor, ocupation) values( '"+number+"','"+type+"','"+surface+"','"+floor+"', '"+ocupation+"')";
						
						Statement stmt = conexion.createStatement();
						stmt.execute(query);
						
						JOptionPane.showMessageDialog(null, "Room added successfully");
						
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
							
				}catch (SQLException e) {
					System.out.println("Error entering data into the database");
					e.printStackTrace();
				}
				}
						
			}
		});
		
		JButton btnNewButton_2 = new JButton("ASSIGN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AsigClientRoomWindow();
			}
		});
		
		btnNewButton_2.setBounds(261, 155, 89, 23);
		panel.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setBounds(414, 155, 89, 23);
		panel.add(btnNewButton_3);
		
		
		ArrayList<Room> listaRooms = baseDatos.getRooms();
		
		for (int i = 0; i < listaRooms.size(); i++) {
			
			modelRoom.addElement(listaRooms.get(i));
			
		}
		
	}
	
	
	
	
}
