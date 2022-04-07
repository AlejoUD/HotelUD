package com.mycompany.HotelUD.classes;


public class Room {
	private Integer numberDoor;
	private String type;
	private int surface;
	private int floor;

	public Room(Integer numberDoor, String type, int surface, int floor) {
		super();
		this.numberDoor = numberDoor;
		this.type = type;
		this.surface = surface;
		this.floor = floor;
	}

	public Room() {
		super();
		this.numberDoor = 0;
		this.type = "";
		this.surface = 0;
		this.floor = 0;
	}

	public Integer getNumberDoor() {
		return numberDoor;
	}

	public void setNumberDoor(Integer numberDoor) {
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

	@Override
	public String toString() {
		return "Room numberDoor: " + numberDoor + ", type: " + type + ", surface: " + surface + ", floor: " + floor;
	}

}
