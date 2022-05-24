package com.mycompany.HotelUD.client;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.UIManager;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Room;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DependientReservaWindow {
	
	private JFrame frame;
	private JTextField nameTxt;
	private JTextField DNITxt;
	private JTextField peopleTxt;
	
	/**
	 * Crea la ventana y genera un ticket.
	 */

	public DependientReservaWindow() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 635, 454);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 128, 274, 181);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel labelName = new JLabel("Name");
		panel.add(labelName);
		
		nameTxt = new JTextField();
		nameTxt.setColumns(10);
		panel.add(nameTxt);
		
		JLabel labelDNI = new JLabel("DNI:");
		panel.add(labelDNI);
		
		DNITxt = new JTextField();
		DNITxt.setColumns(10);
		panel.add(DNITxt);
		
		JLabel labelPeople = new JLabel("How many people?");
		panel.add(labelPeople);
		
		peopleTxt = new JTextField();
		peopleTxt.setColumns(10);
		panel.add(peopleTxt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBounds(87, 30, 414, 34);
		frame.getContentPane().add(panel_1);
		
		JLabel label_3 = new JLabel("Reserve a room");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(label_3);
		
		JLabel labelRooms = new JLabel("Rooms");
		labelRooms.setForeground(Color.ORANGE);
		labelRooms.setFont(new Font("Dialog", Font.BOLD, 11));
		labelRooms.setBounds(425, 96, 56, 21);
		frame.getContentPane().add(labelRooms);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(UIManager.getBorder("TitledBorder.border"));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(294, 128, 315, 181);
		frame.getContentPane().add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 295, 159);
		panel_2.add(scrollPane);
		
		JList list = new JList((ListModel) null);
		scrollPane.setViewportView(list);
		
		JButton btnRoom = new JButton("Rooms");
		btnRoom.setBackground(Color.ORANGE);
		btnRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BBDD.asigRoom((Room) list.getSelectedValue(), null);
			}
		});
		btnRoom.setBounds(425, 343, 89, 23);
		frame.getContentPane().add(btnRoom);
		
		JButton btnReserve = new JButton("Reserve");
		btnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTxt.getText();
				String DNI = DNITxt.getText();
				String people = peopleTxt.getText();
				
				
			}
		});
		btnReserve.setForeground(Color.ORANGE);
		btnReserve.setBounds(103, 343, 89, 23);
		frame.getContentPane().add(btnReserve);
		frame.setTitle("Booking");
		
	}
}
