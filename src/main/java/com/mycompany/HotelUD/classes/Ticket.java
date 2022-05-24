/** \file 
 * Clase Ticket
 * @author Xabat Plaza
 */
package com.mycompany.HotelUD.classes;

public class Ticket {
	/**
	 * Variables de la clase.
	 */
	protected Room room;
	protected User user;

	/**
	 * Constructor por defecto.
	 */
	public Ticket(Room room, User user) {
		super();
		this.room = room;
		this.user = user;
	}

	/**
	 * Constructor vacio.
	 */
	public Ticket() {
		super();
		this.room = null;
		this.user = null;
	}

	/**
	 * Método que devuelve la habitación
	 */
	public Room getRoom() {
		return room;
	}
	/**
	 * Método que asigna la habitación
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	/**
	 * Método que devuelve el usuario
	 */
	public User getUser() {
		return user;
	}
	/**
	 * Método que asigna a un usuario
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Metodo que convierte a String.
	 */
	@Override
	public String toString() {
		return "Ticket: All the room features->" + room.toString() + ". User features->" + user.toString();
	}

}
