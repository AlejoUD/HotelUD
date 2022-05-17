package com.mycompany.HotelUD.classes;


public class Room {
	private int numberDoor;
	private String type;
	private int surface;
	private int floor;
	private String ocupation;
	
	public Room(int numberDoor, String type, int surface, int floor, String ocupation) {
		super();
		this.numberDoor = numberDoor;
		this.type = type;
		this.surface = surface;
		this.floor = floor;
		this.ocupation = ocupation;
	}
	
	public Room() {
		super();
		this.numberDoor = 0;
		this.type = "";
		this.surface = 0;
		this.floor = 0;
		this.ocupation = "No";
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
	
	public String getOcupation() {
		return ocupation;
	}

	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}

	@Override
	public String toString() {
		return "Room [numberDoor=" + numberDoor + ", type=" + type + ", surface=" + surface + ", floor=" + floor
				+ ", ocupation=" + ocupation + "]";
	}

	

}
