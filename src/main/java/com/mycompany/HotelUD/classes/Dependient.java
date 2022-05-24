/** \file 
 * Clase Dependient
 */
package com.mycompany.HotelUD.classes;

public class Dependient {
	/**
	 * Variables de la clase.
	 */
	private int counter;
	protected String name;
	protected String dni;
	protected String password;
	protected String gender;
	protected String position;
	protected String description;
	protected String bankAccount;

	/**
	 * Constructor por defecto.
	 */
	public Dependient(int counter, String name, String dni, String password, String gender, String position,
			String description, String bankAccount) {
		super();
		this.counter = counter;
		this.name = name;
		this.dni = dni;
		this.password = password;
		this.gender = gender;
		this.position = position;
		this.description = description;
		this.bankAccount = bankAccount;
	}

	/**
	 * Constructor vacio.
	 */
	public Dependient() {
		super();
		this.counter = 0;
		this.name = "";
		this.dni = "";
		this.password = "";
		this.gender = "";
		this.position = "";
		this.description = "";
		this.bankAccount = "";
	}

	/**
	 * Método que devuelve el contador
	 */
	public int getCounter() {
		return counter;
	}
	/**
	 * Método que asigna el contador del dependiente
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}
	/**
	 * Método que devuelve el nombre del dependiente
	 */
	public String getName() {
		return name;
	}
	/**
	 * Método que asigna el nombre del dependiente
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Método que devuelve el dni del dependiente
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método que asigna el dni del dependiente
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método que devuelve la contraseña del dependiente
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Método que asigna la contraseña del dependiente
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Método que devuelve el género del dependiente
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Método que asigna el género del dependiente
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Método que devuelve el cargo que tiene el dependiente
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * Método que asigna la posición del dependiente
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * Método que devuelve la descripción del dependiente
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Método que asigna la descripción del dependiente
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Método que devuelve el numero del banco del dependiente
	 */
	public String getBankAccount() {
		return bankAccount;
	}
	/**
	 * Método que asigna el número de la cuenta del dependiente
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		return "Dependient [counter=" + counter + ", name=" + name + ", dni=" + dni + ", password=" + password
				+ ", gender=" + gender + ", position=" + position + ", description=" + description + ", bankAccount="
				+ bankAccount + "]";
	}

}
