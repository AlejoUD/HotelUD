package com.mycompany.HotelUD.classes;


public class Room {
	private int numberDoor;
	private String type;
	private int surface;
	private int floor;
	private boolean ocupation;
	
	public Room(int numberDoor, String type, int surface, int floor, boolean ocupation) {
		super();
		this.numberDoor = numberDoor;
		this.type = type;
		this.surface = surface;
		this.floor = floor;
		this.ocupation = ocupation;
	}
	
	public Room(int numberDoor, String type, int surface, int floor, boolean ocupation) {
		super();
		this.numberDoor = 0;
		this.type = "";
		this.surface = 0;
		this.floor = 0;
		this.ocupation = false;
	}
	
	public int getNumberDoor() {
		return numberDoor;
	}
	public void setNumberDoor(int numberDoor) {
		this.numberDoor = numberDoor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public boolean isOcupation() {
		return ocupation;
	}
	public void setOcupation(boolean ocupation) {
		this.ocupation = ocupation;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Room [numberDoor=" + numberDoor + ", type=" + type + ", surface=" + surface + ", floor=" + floor
				+ ", ocupation=" + ocupation + "]";
	}

}
