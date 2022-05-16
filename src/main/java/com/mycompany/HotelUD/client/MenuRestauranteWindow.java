package com.mycompany.HotelUD.client;

import java.awt.Color;
import java.awt.EventQueue;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Menu;

import javax.swing.*;
import java.awt.Font;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuRestauranteWindow {

	private JFrame frame;
	BBDD baseDatos = new BBDD();


	public MenuRestauranteWindow() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 742, 459);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 306, 732, 124);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCrearMenu = new JButton("Crear Menu");
		btnCrearMenu.setBackground(Color.ORANGE);
		btnCrearMenu.setForeground(Color.BLACK);
		btnCrearMenu.setBounds(304, 11, 117, 37);
		panel.add(btnCrearMenu);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(616, 76, 106, 37);
		panel.add(btnExit);
		
		JLabel labelPlato1 = new JLabel("Primer plato:");
		labelPlato1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		labelPlato1.setForeground(Color.WHITE);
		labelPlato1.setBounds(33, 92, 111, 27);
		frame.getContentPane().add(labelPlato1);
		
		JComboBox comboPlato1 = new JComboBox();
		comboPlato1.setEditable(true);
		comboPlato1.setBounds(148, 95, 191, 22);
		frame.getContentPane().add(comboPlato1);
		
		comboPlato1.addItem("");
		comboPlato1.addItem("Macarrones con tomate");
		comboPlato1.addItem("Lentejas con chorizo");
		comboPlato1.addItem("Garbanzos");
		comboPlato1.addItem("Arroz blanco con guisantes");
		comboPlato1.addItem("Paella");
		
		JLabel labelPlato2 = new JLabel("Segundo plato:");
		labelPlato2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelPlato2.setForeground(Color.WHITE);
	
		labelPlato2.setBounds(33, 130, 111, 27);
		frame.getContentPane().add(labelPlato2);
		
		JComboBox comboPlato2 = new JComboBox();
		comboPlato2.setEditable(true);
		comboPlato2.setBounds(148, 133, 191, 22);
		frame.getContentPane().add(comboPlato2);
		
		comboPlato2.addItem("");
		comboPlato2.addItem("Pollo");
		comboPlato2.addItem("Chuleta");
		comboPlato2.addItem("Lomo");
		comboPlato2.addItem("Pechugas de pavo");
		comboPlato2.addItem("Entrecot");
		comboPlato2.addItem("Bistec");
		
		JLabel lblPostre = new JLabel("Postre:");
		lblPostre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPostre.setForeground(Color.WHITE);
	
		lblPostre.setBounds(33, 168, 111, 27);
		frame.getContentPane().add(lblPostre);
		
		JLabel lblBebida = new JLabel("Bebida:");
		lblBebida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBebida.setForeground(Color.WHITE);
	
		lblBebida.setBounds(33, 206, 111, 27);
		frame.getContentPane().add(lblBebida);
		
		JLabel lblCondimentos = new JLabel("Condimentos:");
		lblCondimentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCondimentos.setForeground(Color.WHITE);
		
		lblCondimentos.setBounds(516, 128, 111, 27);
		frame.getContentPane().add(lblCondimentos);
		
		JComboBox comboPostre = new JComboBox();
		comboPostre.setEditable(true);
		comboPostre.setBounds(148, 171, 191, 22);
		frame.getContentPane().add(comboPostre);
		
		comboPostre.addItem("");
		comboPostre.addItem("Helado");
		comboPostre.addItem("Natillas");
		comboPostre.addItem("Arroz con leche");
		comboPostre.addItem("Yogourt");
		
		JComboBox comboBebida = new JComboBox();
		comboBebida.setEditable(true);
		comboBebida.setBounds(148, 209, 191, 22);
		frame.getContentPane().add(comboBebida);
		
		comboBebida.addItem("");
		comboBebida.addItem("Agua");
		comboBebida.addItem("Sidra");
		comboBebida.addItem("Vino");
		comboBebida.addItem("Cerveza");
		
		JCheckBox cbKetchup = new JCheckBox("Ketchup");
		cbKetchup.setBackground(Color.DARK_GRAY);
		cbKetchup.setForeground(Color.WHITE);
		cbKetchup.setBounds(516, 157, 99, 23);
		frame.getContentPane().add(cbKetchup);
		
		JCheckBox cbMayonesa = new JCheckBox("Mayonesa");
		cbMayonesa.setForeground(Color.WHITE);
		cbMayonesa.setBackground(Color.DARK_GRAY);
		cbMayonesa.setBounds(516, 183, 99, 23);
		frame.getContentPane().add(cbMayonesa);
		
		JCheckBox cbMostaza = new JCheckBox("Mostaza");
		cbMostaza.setForeground(Color.WHITE);
		cbMostaza.setBackground(Color.DARK_GRAY);
		cbMostaza.setBounds(516, 209, 99, 23);
		frame.getContentPane().add(cbMostaza);
		
		JCheckBox cbAlioli = new JCheckBox("Alioli");
		cbAlioli.setForeground(Color.WHITE);
		cbAlioli.setBackground(Color.DARK_GRAY);
		cbAlioli.setBounds(516, 234, 99, 23);
		frame.getContentPane().add(cbAlioli);
		
		JLabel lblCrearUnMenu = new JLabel("Crear un menu para el restaurante");
		lblCrearUnMenu.setForeground(Color.WHITE);
		lblCrearUnMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCrearUnMenu.setBounds(207, 11, 357, 27);
		frame.getContentPane().add(lblCrearUnMenu);
		
		btnCrearMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Menu m = new Menu();
				m.setPlato1((String) comboPlato1.getSelectedItem());
				m.setPlato2((String)comboPlato2.getSelectedItem());
				m.setPostre((String)comboPostre.getSelectedItem());
				m.setBebida((String)comboBebida.getSelectedItem());
				List condimentos = new ArrayList();
				if(cbKetchup.isSelected()) {
					condimentos.add("Ketchup");
				}else if (cbAlioli.isSelected()) {
					condimentos.add("Alioli");
					
				}else if (cbMostaza.isSelected()) {
					condimentos.add("Mostaza");
				}else if (cbMayonesa.isSelected()) {
					condimentos.add("Mayonesa");
				}
				m.setCondimento(condimentos);
				JOptionPane.showMessageDialog(null, "Menu added successfully");
				comboPlato1.setSelectedItem("");
				comboPlato2.setSelectedItem("");
				comboPostre.setSelectedItem("");
				comboBebida.setSelectedItem("");
				baseDatos.addMenu(m);
			}
		});
		
	}
}
