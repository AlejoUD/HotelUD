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
	 * Geters y Seters.
	 */
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

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
