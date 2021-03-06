/** \file 
 * Clase AsigRoom
 */
package com.mycompany.HotelUD.classes;


public class AsigRoom {
	/**
	 * Variables de la clase.
	 */
	protected Room room;
	private String dni;
	private String fecha;

	/**
	 * Constructor por defecto.
	 */
	public AsigRoom(Room room, String dni, String fecha) {
		super();
		this.room = room;
		this.dni = dni;
		this.fecha = fecha;
	}

	/**
	 * Constructor vacio.
	 */
	public AsigRoom() {
		super();
		this.room = null;
		this.dni = "";
		this.fecha ="";
	}

	/**
	 * Método que devuelve una habitación
	 */
	public Room getRoom() {
		return room;
	}
	/**
	 * Método que asigna una habitación
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	/**
	 * Método que devuelve el dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método que asigna un dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método que devuelve la fecha
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * Método que asigna una fecha
	 */
	public String setFecha(String fecha) {
		return this.fecha = fecha;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rooms information: " + room.toString() + ", DNI: " + dni + ", fecha: " + fecha;
	}

//	@Override
//	public int getNumberDoor() {
//		// TODO Auto-generated method stub
//		return super.getNumberDoor();
//	}
//
//	@Override
//	public void setNumberDoor(int numberDoor) {
//		// TODO Auto-generated method stub
//		super.setNumberDoor(numberDoor);
//	}
//
//	@Override
//	public String getType() {
//		// TODO Auto-generated method stub
//		return super.getType();
//	}
//
//	@Override
//	public void setType(String type) {
//		// TODO Auto-generated method stub
//		super.setType(type);
//	}
//
//	@Override
//	public int getSurface() {
//		// TODO Auto-generated method stub
//		return super.getSurface();
//	}
//
//	@Override
//	public void setSurface(int surface) {
//		// TODO Auto-generated method stub
//		super.setSurface(surface);
//	}
//
//	@Override
//	public int getFloor() {
//		// TODO Auto-generated method stub
//		return super.getFloor();
//	}
//
//	@Override
//	public void setFloor(int floor) {
//		// TODO Auto-generated method stub
//		super.setFloor(floor);
//	}

}
