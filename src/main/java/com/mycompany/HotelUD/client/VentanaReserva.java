package com.mycompany.HotelUD.client;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class VentanaReserva extends JFrame{
	private static JTextField txtDNI;
	
	private JPanel panel;
	
	private JButton button;
	
	private JLabel labelDNI;
	private JLabel labelNombre;
	private static JLabel txtNombre;
	private JLabel labelApellido;
	private static JLabel txtApellido;
	private JLabel lblGenero;
	private static JLabel txtGenero;
	private JLabel labelEdad;
	private static JLabel txtEdad;
	private JLabel lblCuentaBancaria;
	private JLabel txtXCuentaBancaria;
	
	public VentanaReserva() {
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		labelDNI = new JLabel();
		labelDNI.setText("DNI pasajero");
		
		labelNombre = new JLabel();
		labelNombre.setText("Nombre");
		
		txtNombre = new JLabel();
		txtNombre.setText(" ");
		txtNombre.setForeground(Color.RED);
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNombre.setEnabled(false);
		
		labelApellido = new JLabel();
		labelApellido.setText("Apellido");
		
		txtApellido = new JLabel();
		txtApellido.setText(" ");
		txtApellido.setForeground(Color.RED);
		txtApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtApellido.setEnabled(false);
		
		lblGenero = new JLabel();
		lblGenero.setText("Genero");
		
		txtGenero = new JLabel();
		txtGenero.setText(" ");
		txtGenero.setForeground(Color.RED);
		txtGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtGenero.setEnabled(false);
		
		txtDNI = new JTextField();
		
		labelEdad = new JLabel();
		labelEdad.setText("Edad");
		
		txtEdad = new JLabel();
		txtEdad.setText(" ");
		txtEdad.setForeground(Color.RED);
		txtEdad.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEdad.setEnabled(false);
		
		lblCuentaBancaria = new JLabel();
		lblCuentaBancaria.setText("Cuenta Bancaria");
		
		txtXCuentaBancaria = new JLabel();
		txtXCuentaBancaria.setText(" ");
		txtXCuentaBancaria.setForeground(Color.RED);
		txtXCuentaBancaria.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtXCuentaBancaria.setEnabled(false);
		
		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generarPDF();
				dispose();
				new UserWindow();
			}
		});
		button.setText("Reservar");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(labelDNI)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(labelNombre)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(labelApellido)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblGenero)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGenero, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblCuentaBancaria)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtXCuentaBancaria, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(labelEdad, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
							.addGap(234))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txtDNI, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelDNI)
						.addComponent(txtDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelNombre)
						.addComponent(txtNombre)
						.addComponent(labelEdad)
						.addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelApellido)
						.addComponent(txtApellido)
						.addComponent(txtXCuentaBancaria, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCuentaBancaria))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGenero)
						.addComponent(txtGenero))
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
	}
	
	public static void generarPDF() {
		String dniImpreso = txtDNI.getText();
		String nombreImpreso = txtNombre.getText();
		String apellidoImpreso = txtApellido.getText();
		String edadImpreso = txtEdad.getText();
		String generoImpreso = txtGenero.getText();
		
		//generar el PDF
		try {
			long milis=System.currentTimeMillis();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH_mm_ss");
			Date fecha = new Date(milis);
			String f = sdf.format(fecha);
			String pw = System.getProperty("user.dir") +"/" +f + ".pdf";
			Document documento = new Document();
			PdfWriter writer = null;
			try {
				writer = PdfWriter.getInstance(documento, new FileOutputStream(pw));
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			documento.open();
			
			Paragraph marcaDeAgua=new Paragraph();
			marcaDeAgua.setAlignment(marcaDeAgua.ALIGN_TOP);
			marcaDeAgua.setFont(FontFactory.getFont("Sans", 30, Font.ITALIC, BaseColor.ORANGE));
			marcaDeAgua.add("Hotel UD");
			Paragraph parrafo=new Paragraph();
			parrafo.setAlignment(Paragraph.ALIGN_CENTER);
			parrafo.setFont(FontFactory.getFont("Sans", 20, Font.BOLD, BaseColor.BLUE));
			parrafo.add("Dni: "+dniImpreso+"\n"+"Nombre: "+nombreImpreso+"\n"+"Apellido: "+apellidoImpreso+"\n"+"Genero: "+generoImpreso+"\n"+"Edad: "+edadImpreso+"\n");
			try {
				documento.add(marcaDeAgua);
				documento.add(parrafo);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			documento.close();
			writer.close();
		
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
