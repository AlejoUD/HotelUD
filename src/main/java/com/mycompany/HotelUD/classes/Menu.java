package com.mycompany.HotelUD.classes;

public class Menu {
	private String plato1;
	private String plato2;
	private String postre;
	private String bebida;
	private String condimento;
	public Menu(String plato1, String plato2, String postre, String bebida, String condimento) {
		super();
		this.plato1 = plato1;
		this.plato2 = plato2;
		this.postre = postre;
		this.bebida = bebida;
		this.condimento = condimento;
	}
	
	public Menu() {
		super();
		this.plato1 = "";
		this.plato2 = "";
		this.postre = "";
		this.bebida = "";
		this.condimento = "";
	}

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

	public String getCondimento() {
		return condimento;
	}

	public void setCondimento(String condimento) {
		this.condimento = condimento;
	}

	@Override
	public String toString() {
		return "Menu: Primer plato: " + plato1 + ", segundo plato: " + plato2 + ", postre: " + postre + ", bebida: " + bebida
				+ ", condimentos" + condimento + "]";
	}
	
	
	

}
