package com.mycompany.HotelUD.client;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Menu;


public class DependientWindow {

	private JFrame frame;
	BBDD baseDatos = new BBDD();
	private JTextField txtResult;
	private static Logger logJava = Logger.getLogger(Main.class);

	/**
	 * Crea la ventana y permite crear trabajadores nuevos.
	 */

	public DependientWindow(String texto) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 635, 454);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("Bienvenido");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(234, 11, 286, 56);
		frame.getContentPane().add(lblTitulo);

		JPanel panel = new JPanel();
		panel.setBounds(10, 91, 601, 102);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnVerMenus = new JButton("Ver menus");
		btnVerMenus.setBounds(73, 11, 171, 29);
		panel.add(btnVerMenus);
		btnVerMenus.setBackground(Color.ORANGE);

		JButton btnVerHabitaciones = new JButton("Ver habitaciones");
		btnVerHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewRoomsWindow();
			}
		});
		btnVerHabitaciones.setBounds(340, 11, 171, 29);
		panel.add(btnVerHabitaciones);
		btnVerHabitaciones.setBackground(Color.ORANGE);

		JButton btnBack = new JButton("Back");
		btnBack.setBackground(Color.ORANGE);
		btnBack.setBounds(340, 62, 171, 29);
		panel.add(btnBack);

		JButton btnReserva = new JButton("Booking");
		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DependientReservaWindow();
			}
		});
		btnReserva.setBackground(Color.ORANGE);
		btnReserva.setBounds(73, 65, 171, 26);
		panel.add(btnReserva);

		DefaultListModel<Menu> modelMenu = new DefaultListModel<>();
		Menu menu = new Menu();

		ArrayList<Menu> arrayM = new ArrayList<>();

		btnVerMenus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				logJava.debug(baseDatos.getMenu());
				for (Menu m : baseDatos.getMenu()) {
					modelMenu.addElement(m);
				}

			}
		});

		JPanel menu_panel = new JPanel();
		menu_panel.setLayout(null);
		menu_panel.setBorder(UIManager.getBorder("TitledBorder.border"));
		menu_panel.setBackground(Color.DARK_GRAY);
		menu_panel.setBounds(52, 235, 512, 144);
		frame.getContentPane().add(menu_panel);

		JList menu_list = new JList(modelMenu);
		menu_list.setBounds(52, 235, 512, 144);
		menu_panel.add(menu_list);

		JScrollPane scrollMenu = new JScrollPane(menu_list);
		scrollMenu.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollMenu.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollMenu.setBounds(0, 0, 512, 144);
		menu_panel.add(scrollMenu);

	}

}
