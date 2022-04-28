package com.mycompany.HotelUD.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class WindowServer extends JFrame {

	private JPanel contentPane;
	BBDD baseDatos = new BBDD();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowServer frame = new WindowServer();
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
	public WindowServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 531);
		 this.setTitle("Server Home");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu1= new JMenu("Menu");
		menuBar.add(menu1);
		
		JMenuItem menu2= new JMenuItem("Exit");
		menuBar.add(menu2);
		
		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		JMenuItem ItemWorkers = new JMenuItem("Workers");
		menu1.add(ItemWorkers);
		
		ItemWorkers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
			
		});
		
		JMenuItem ItemRooms = new JMenuItem("Rooms");
		menu1.add(ItemRooms);
		
		ItemRooms.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
			
		});
		
		JMenuItem ItemClients = new JMenuItem("Clients");
		menu1.add(ItemClients);
		
		ItemClients.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
			
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton exitButton = new JButton("EXIT");
		exitButton.setBounds(649, 434, 89, 23);
		contentPane.add(exitButton);
		
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		
		
		//Rooms
		
		JPanel room_panel = new JPanel();
		room_panel.setLayout(null);
		room_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		room_panel.setBackground(Color.DARK_GRAY);
		room_panel.setBounds(423, 42, 315, 181);
		
		
		
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
		
		JScrollPane room_scrollPane = new JScrollPane(room_list);
//		room_scrollPane.setBounds(10, 11, 295, 159);
		room_scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		room_panel.add(room_list);
		contentPane.add(room_panel);
		
		
		JLabel labelRooms = new JLabel("Rooms");
		labelRooms.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelRooms.setBounds(423, 17, 46, 14);
		contentPane.add(labelRooms);
		
		
		//Clients
		JPanel client_panel = new JPanel();
		client_panel.setLayout(null);
		client_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		client_panel.setBackground(Color.DARK_GRAY);
		client_panel.setBounds(10, 42, 315, 181);
		contentPane.add(client_panel);
		
		JScrollPane client_scrollPane = new JScrollPane();
		//client_scrollPane.setBounds(10, 11, 295, 159);
		client_panel.add(client_scrollPane);
		
		DefaultListModel modelUsers = new DefaultListModel<>();
		User user = new User();
		System.out.println( baseDatos.getUsers());
		ArrayList<User> arrayU = new ArrayList<>();
		for (User u : baseDatos.getUsers()) {
			modelUsers.addElement(u);
		}
		
		JList client_list = new JList(modelUsers);
		client_list.setBounds(10, 11, 295, 159);
		client_panel.add(client_list);
		
		JLabel labelClient = new JLabel("Clients");
		labelClient.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelClient.setBounds(10, 17, 46, 14);
		contentPane.add(labelClient);
		
		
		// Workers
		JPanel worker_panel = new JPanel();
		worker_panel.setLayout(null);
		worker_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		worker_panel.setBackground(Color.DARK_GRAY);
		worker_panel.setBounds(10, 276, 315, 181);
		contentPane.add(worker_panel);
		
		JScrollPane worker_scrollPane = new JScrollPane();
		//worker_scrollPane.setBounds(10, 11, 295, 11);
		worker_panel.add(worker_scrollPane);
		
		DefaultListModel modelWorker = new DefaultListModel<>();
		Worker worker = new Worker();
		System.out.println( baseDatos.getWorkers());
		ArrayList<Worker> arrayW = new ArrayList<>();
		for (Worker w : baseDatos.getWorkers()) {
			modelWorker.addElement(w);
		}
		
		JList worker_list = new JList(modelWorker);
		worker_list.setBounds(10, 11, 295, 159);
		worker_panel.add(worker_list);
		
		
		JLabel labelWorkers = new JLabel("Workers");
		labelWorkers.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelWorkers.setBounds(10, 251, 46, 14);
		contentPane.add(labelWorkers);
	}
}
