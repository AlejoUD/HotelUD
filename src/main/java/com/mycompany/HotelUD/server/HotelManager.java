package com.mycompany.HotelUD.server;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.EmptyBorder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

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

public class HotelManager extends JFrame implements Runnable{

	private JPanel contentPane;
	BBDD baseDatos = new BBDD();
	
	private Client client;
	private WebTarget webTarget;
	private static Logger logJava = Logger.getLogger(HotelManager.class);
	
	
	public HotelManager(String hostname, String port) {
		
		client = ClientBuilder.newClient();
		webTarget = client.target(String.format("http://%s:%s/rest", hostname, port));
		
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
		contentPane.add(room_panel);


		DefaultListModel<Room> modelRoom = new DefaultListModel<>();
		Room room = new Room();
		ArrayList<Room> arrayR = new ArrayList<>();
		for (Room r : baseDatos.getRooms()) {
			modelRoom.addElement(r);
		}
		logJava.info( "Successful in adding rooms to the model.");

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
		labelRooms.setBounds(423, 17, 46, 14);
		contentPane.add(labelRooms);


		//Clients
		JPanel client_panel = new JPanel();
		client_panel.setLayout(null);
		client_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		client_panel.setBackground(Color.DARK_GRAY);
		client_panel.setBounds(10, 42, 315, 181);
		contentPane.add(client_panel);

		DefaultListModel modelUsers = new DefaultListModel<>();
		User user = new User();
		ArrayList<User> arrayU = new ArrayList<>();
		for (User u : baseDatos.getUsers()) {
			modelUsers.addElement(u);
		}

		JList client_list = new JList(modelUsers);		
		JScrollPane scrollClients = new JScrollPane(client_list);
		scrollClients.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollClients.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollClients.setBounds(10, 11, 295, 159);
		client_panel.add(scrollClients);

		JLabel labelClient = new JLabel("Clients");
		labelClient.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelClient.setBounds(10, 17, 46, 14);
		contentPane.add(labelClient);
		logJava.info( "Successful in adding users to the model.");


		// Workers
		JPanel worker_panel = new JPanel();
		worker_panel.setLayout(null);
		worker_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		worker_panel.setBackground(Color.DARK_GRAY);
		worker_panel.setBounds(10, 276, 315, 181);
		contentPane.add(worker_panel);


		DefaultListModel modelWorker = new DefaultListModel<>();
		ArrayList<Worker> arrayW = new ArrayList<>();
		for (Worker w : baseDatos.getWorkers()) {
			modelWorker.addElement(w);
		}
		logJava.info( "Successful in adding workers to the model.");

		JList worker_list = new JList(modelWorker);
		JScrollPane scrollWorkers = new JScrollPane(worker_list);
		scrollWorkers.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollWorkers.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollWorkers.setBounds(10, 11, 295, 159);
		worker_panel.add(scrollWorkers);

		JLabel labelWorkers = new JLabel("Workers");
		labelWorkers.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		labelWorkers.setBounds(10, 251, 70, 30);
		contentPane.add(labelWorkers);
		
		setVisible(true);
	}
	
	
	public ArrayList<Worker> getWorkers() {
		WebTarget donationsWebTarget = webTarget.path("collector/worker");
		Invocation.Builder invocationBuilder = donationsWebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		if (response.getStatus() == Status.OK.getStatusCode()) {
			ArrayList<Worker> workers = response.readEntity(ArrayList.class);
			return workers;
		} else {
			return null;
		}
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				try {
					
					String hostname = args[0];
					String port = args[1];
					 new HotelManager(hostname, port);   
					 logJava.info( "Successfully opening server");
					
				} catch (Exception e) {
					logJava.error("Error opening server");
				}
	}


	@Override
	public void run() {
		
		
	}
	
}