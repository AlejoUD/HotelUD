package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdminWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuAdminWindow() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lMenuPrinc = new JLabel("MENÚ PRINCIPAL ADMINISTRADOR");
		lMenuPrinc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lMenuPrinc.setForeground(new Color(0, 0, 0));
		lMenuPrinc.setBounds(149, 64, 315, 25);
		contentPane.add(lMenuPrinc);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginWindow();
				dispose();
			}
		});
		btnBack.setBounds(455, 288, 89, 23);
		contentPane.add(btnBack);
	}
}
