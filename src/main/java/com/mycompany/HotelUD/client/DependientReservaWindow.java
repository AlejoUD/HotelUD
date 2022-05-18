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
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DependientReservaWindow {
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
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
		
		JLabel label = new JLabel("Name");
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("DNI:");
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("How many people?");
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBounds(87, 30, 414, 34);
		frame.getContentPane().add(panel_1);
		
		JLabel label_3 = new JLabel("Reserve a room");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Rooms");
		label_4.setForeground(Color.ORANGE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 11));
		label_4.setBounds(425, 96, 56, 21);
		frame.getContentPane().add(label_4);
		
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
		
		JButton btnNewButton = new JButton("Rooms");
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(425, 343, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reserve");
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBounds(103, 343, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setTitle("Booking");
		
	}
}
