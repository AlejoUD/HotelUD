package com.mycompany.HotelUD.classes;

public class AsigRoom extends Room{
	
	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public AsigRoom(Integer numberDoor, String type, int surface, int floor, String dni) {
		super(numberDoor, type, surface, floor);
		this.dni = dni;
	}

	@Override
	public Integer getNumberDoor() {
		// TODO Auto-generated method stub
		return super.getNumberDoor();
	}

	@Override
	public void setNumberDoor(Integer numberDoor) {
		// TODO Auto-generated method stub
		super.setNumberDoor(numberDoor);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public int getSurface() {
		// TODO Auto-generated method stub
		return super.getSurface();
	}

	@Override
	public void setSurface(int surface) {
		// TODO Auto-generated method stub
		super.setSurface(surface);
	}

	@Override
	public int getFloor() {
		// TODO Auto-generated method stub
		return super.getFloor();
	}

	@Override
	public void setFloor(int floor) {
		// TODO Auto-generated method stub
		super.setFloor(floor);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
