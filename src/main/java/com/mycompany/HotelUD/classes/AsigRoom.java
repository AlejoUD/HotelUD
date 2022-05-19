/** \file 
 * Clase AsigRoom
 */
package com.mycompany.HotelUD.classes;

import java.sql.Date;

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
		this.fecha = null;
	}

	/**
	 * Geters y Seters.
	 */
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public String setFecha() {
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
