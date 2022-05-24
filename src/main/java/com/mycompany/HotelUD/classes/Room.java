/** \file 
 * Clase room, a continuacion sus caracteristicas.
 */
package com.mycompany.HotelUD.classes;


public class Room {
	private int numberDoor;
	private String type;
	private int surface;
	private int floor;
	private String ocupation;
	

	/**
	 * Construye una habitación con sus atributos correspondientes.
	 */
	public Room(int numberDoor, String type, int surface, int floor, String ocupation) {
		super();
		this.numberDoor = numberDoor++;
		this.type = type;
		this.surface = surface;
		this.floor = floor;
		this.ocupation = ocupation;
	}
	/**
	 * Este es un constructor por defecto.
	 */
	public Room() {
		super();
		this.numberDoor = numberDoor++;
		this.type = "";
		this.surface = 0;
		this.floor = 0;
		this.ocupation = "No";
	}
	/**
	 * Método que devuelve el número de la puerta de la habitación
	 */
	public int getNumberDoor() {
		return numberDoor;
	}
	/**
	 * Método que asigna el número de la puerta de la habitación
	 */
	public void setNumberDoor(int numberDoor) {
		this.numberDoor = numberDoor;
	}
	/**
	 * Método que devuelve el tipo de habitación
	 */
	public String getType() {
		return type;
	}
	/**
	 * Método que asigna el tipo de habitación
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Método que devuelve la cantidad de superficie que ocupa la habitación
	 */
	public int getSurface() {
		return surface;
	}
	/**
	 * Método que asigna la cantidad de superficie que ocupa la habitación
	 */
	public void setSurface(int surface) {
		this.surface = surface;
	}
	/**
	 * Método que devuelve la planta a la que pertenece la habitación
	 */
	public int getFloor() {
		return floor;
	}
	/**
	 * Método que asigna la planta a la que pertenece la habitación
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	/**
	 * Método que devuelve si la habitación esta ocupanda o no
	 */
	public String getOcupation() {
		return ocupation;
	}
	/**
	 * Método que asigna si la habitación esta ocupanda o no
	 */
	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	/**
	 * Método que devuelve el String
	 */
	@Override
	public String toString() {
		return "Room number: " + numberDoor + " | Type: " + type + " | Surface: " + surface + " | Floor: " + floor + " | Occupation: " + ocupation; // put
		
	}

	

}
