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
	 * Método que devuelve el primer plato del menú
	 */
	public String getPlato1() {
		return plato1;
	}
	/**
	 * Método que asigna el primer plato del menú
	 */
	public void setPlato1(String plato1) {
		this.plato1 = plato1;
	}
	/**
	 * Método que devuelve el segundo plato del menú
	 */
	public String getPlato2() {
		return plato2;
	}
	/**
	 * Método que asigna el segundo plato del menú
	 */
	public void setPlato2(String plato2) {
		this.plato2 = plato2;
	}
	/**
	 * Método que devuelve el postre del menú
	 */
	public String getPostre() {
		return postre;
	}
	/**
	 * Método que asigna el postre del menú
	 */
	public void setPostre(String postre) {
		this.postre = postre;
	}
	/**
	 * Método que devuelve la bebida del menú
	 */
	public String getBebida() {
		return bebida;
	}
	/**
	 * Método que asigna la bebida del menú
	 */
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	/**
	 * Método que devuelve una lista de los condimentos del menú
	 */
	public List<String> getCondimento() {
		return condimento;
	}
	/**
	 * Método que asigna la lista de los consimentos del menú
	 */
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
