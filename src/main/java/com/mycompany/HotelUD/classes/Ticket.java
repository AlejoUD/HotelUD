package com.mycompany.HotelUD.classes;

public class Ticket {
	protected Room room;
	protected User user;
	public Ticket(Room room, User user) {
		super();
		this.room = room;
		this.user = user;
	}
	public Ticket() {
		super();
		this.room = null;
		this.user = null;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Ticket: All the room features->" + room.toString() + ". User features->"+ user.toString();
	}
	
	

}
