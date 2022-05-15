package com.mycompany.HotelUD.client;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Room;

public class ReservaWindow {

	private JFrame frame;
	
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField dniField;
	private JTextField peopleField;
	BBDD baseDatos = new BBDD();

	public ReservaWindow(String texto) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		frame.setBounds(100, 100, 869, 302);
		frame.setTitle("Server Home");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBounds(10, 11, 414, 34);
		contentPane.add(TitlePanel);
		
		JLabel lblNewLabel = new JLabel("Reserve a room");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		TitlePanel.add(lblNewLabel);
		
		JPanel InformationPanel = new JPanel();
		InformationPanel.setBounds(10, 56, 414, 155);
		contentPane.add(InformationPanel);
		InformationPanel.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel nameLabel = new JLabel("Name");
		InformationPanel.add(nameLabel);
		
		nameField = new JTextField();
		InformationPanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel dniLabel = new JLabel("DNI:");
		InformationPanel.add(dniLabel);
		
		dniField = new JTextField();
		InformationPanel.add(dniField);
		dniField.setColumns(10);
		dniField.setText(texto);
		
		JLabel personas = new JLabel("How many people?");
		InformationPanel.add(personas);
		
		peopleField = new JTextField();
		InformationPanel.add(peopleField);
		peopleField.setColumns(10);
		
	
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBounds(10, 222, 414, 280);
		contentPane.add(ButtonPanel);
		
		//Rooms
		
		JPanel room_panel = new JPanel();
		room_panel.setLayout(null);
		room_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		room_panel.setBackground(Color.DARK_GRAY);
		room_panel.setBounds(498, 43, 315, 181);
		contentPane.add(room_panel);
		
		
		DefaultListModel<Room> modelRoom = new DefaultListModel<>();
		Room room = new Room();
		System.out.println( baseDatos.getRooms());
		ArrayList<Room> arrayR = new ArrayList<>();
		for (Room r : baseDatos.getRooms()) {
			modelRoom.addElement(r);
		}
		
		JList room_list = new JList(modelRoom);
		room_list.setBounds(10, 11, 295, 159);
		room_panel.add(room_list);
		
		JScrollPane scrollRoom = new JScrollPane(room_list);
		scrollRoom.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollRoom.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollRoom.setBounds(10, 11, 295, 159);
		room_panel.add(scrollRoom);
		
		JLabel labelRooms = new JLabel("Rooms");
		labelRooms.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelRooms.setBounds(498, 18, 46, 14);
		contentPane.add(labelRooms);
		
		JButton imprimirTicketButton = new JButton("Imprimir ticket");
		ButtonPanel.add(imprimirTicketButton);
		
		imprimirTicketButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				Document documento = new Document();
				Paragraph titulo = new Paragraph("Ticket de la reserva de la habitacion");
				FileOutputStream archivo = new FileOutputStream("ticket.pdf");
				PdfWriter.getInstance(documento, archivo);
				documento.open();
				titulo.setAlignment(1);
				documento.add(titulo);
				documento.add(new Paragraph("Nombre: "+ nameField.getText()));
				documento.add(new Paragraph("DNI: "+ dniField.getText()));
				documento.add(new Paragraph("People: "+ peopleField.getText()));				
				documento.add(new Paragraph("Room: "+ room_list.getSelectedValue()));
				documento.close();
				} catch (FileNotFoundException | DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}

}
