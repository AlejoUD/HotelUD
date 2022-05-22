/** \file 
 * Clase Menu
 * @author Xabat Plaza
 */
package com.mycompany.HotelUD.classes;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	/**
	 * Variables de la clase.
	 */
	private String plato1;
	private String plato2;
	private String postre;
	private String bebida;
	private List<String> condimento;

	/**
	 * Constructor por defecto.
	 */
	public Menu(String plato1, String plato2, String postre, String bebida, List<String> condimento) {
		super();
		this.plato1 = plato1;
		this.plato2 = plato2;
		this.postre = postre;
		this.bebida = bebida;
		this.condimento = condimento;
	}

	/**
	 * Constructor vacio.
	 */
	public Menu() {
		super();
		this.plato1 = "";
		this.plato2 = "";
		this.postre = "";
		this.bebida = "";
		this.condimento = new ArrayList<String>();
	}

	/**
	 * Geters y Seters.
	 */
	public String getPlato1() {
		return plato1;
	}

	public void setPlato1(String plato1) {
		this.plato1 = plato1;
	}

	public String getPlato2() {
		return plato2;
	}

	public void setPlato2(String plato2) {
		this.plato2 = plato2;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public List<String> getCondimento() {
		return condimento;
	}

	public void setCondimento(List<String> condimentos) {
		this.condimento = condimentos;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		return "Menu: Primer plato: " + plato1 + ", segundo plato: " + plato2 + ", postre: " + postre + ", bebida: "
				+ bebida + ", condimentos" + condimento + "]";
	}

}
