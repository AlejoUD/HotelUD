/** \file 
 * Clase Worker
 */
package com.mycompany.HotelUD.classes;

public class Worker {
	/**
	 * Variables de la clase.
	 */
	private int counter;
	private String name;
	private String dni;
	private String gender;
	private int age;

	/**
	 * Constructor por defecto.
	 */
	public Worker(int counter, String name, String dni, String gender, int age) {
		super();
		this.counter = counter++;
		this.name = name;
		this.dni = dni;
		this.gender = gender;
		this.age = age;
	}

	/**
	 * Constructor vacio.
	 */
	public Worker() {
		super();
		this.counter = counter++;
		this.name = "";
		this.dni = "";
		this.gender = "";
		this.age = 0;
	}

	/**
	 * Método que devuelve un contador único.
	 */
	public int getCounter() {
		return counter;
	}
	/**
	 * Método que pone el número de  un contador único.
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}
	/**
	 * Método que devuelve el nombre del trabajador.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Método que permite poner el nombre al trabajador.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Método que devuelve el dni del trabajador.
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método que permite poner el dni de un trabajador.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método que devuelve el género del trabajador.
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Método que permite poner el género del trabajador.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Método que devuelve la edad del trabajador.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Método que permite seleccionar la edad del trabajador.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		return "Worker code" + counter + ", name: " + name + ", dni: " + dni + ", gender: " + gender + ", age: " + age;
	}

}
