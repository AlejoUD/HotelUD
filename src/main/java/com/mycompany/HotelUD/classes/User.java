/** \file 
 * Clase User
 */
package com.mycompany.HotelUD.classes;

public class User {
	/**
	 * Variables de la clase.
	 */
	private int counter;
	private String name;
	private String dni;
	private String gender;
	private int age;
	private String password;
	private String bankCount;

	/**
	 * Constructor por defecto.
	 */
	public User(int counter, String name, String dni, String gender, int age, String password, String bankCount) {
		super();
		this.counter = counter;
		this.name = name;
		this.dni = dni;
		this.gender = gender;
		this.age = age;
		this.password = password;
		this.bankCount = bankCount;
	}

	/**
	 * Constructor vacio.
	 */
	public User() {
		super();
		this.counter = 0;
		this.name = "";
		this.dni = "";
		this.gender = "";
		this.age = 0;
		this.password = "";
		this.bankCount = "";
	}

	/**
	 * Método que devuelve el nombre del usuario.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Método que permite poner el nombre del usuario.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Método que devuelve el dni del usuario.
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método que devuelve un contador único.
	 */
	public int getCounter() {
		return counter;
	}
	/**
	 * Método que pone un contador único.
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}
	/**
	 * Método que permite poner el dni de un usuario.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método que devuelve el género de un usuario.
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Método que permite poner el género de un usuario.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Método que devuelve la edad de un usuario.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Método que permite poner la edad de un usuario.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Método que devuelve la contraseña de un usuario.
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Método que permite poner la contraseña de un usuario.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Método que devuelve la cuenta bancaria de un usuario.
	 */
	public String getBankCount() {
		return bankCount;
	}
	/**
	 * Método que permite poner el número de cuenta bancaria de un usuario.
	 */
	public void setBankCount(String bankCount) {
		this.bankCount = bankCount;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		return "User code " + counter + " name: " + name + ", dni: " + dni + ", gender: " + gender + ", age: " + age
				+ ", password: " + password + ", bankCount: " + bankCount;
	}
}
