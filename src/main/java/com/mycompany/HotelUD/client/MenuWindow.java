package com.mycompany.HotelUD.client;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuWindow extends JFrame {

	private ImageIcon imagen;

	public MenuWindow() {

		imagen = new ImageIcon("bin/images/Menu.png");

		setVisible(true);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 699, 680);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAdminWindow();
				dispose();
			}
		});
		btnNewButton.setIcon(imagen);
		panel.add(btnNewButton);

	}
}
