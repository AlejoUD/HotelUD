package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.HotelUD.classes.Room;

public class RoomTest {

	Room a = new Room(12, "Standard", 1, 1);
	Room b = new Room();

	@Test
	public void testGetNUmberRoom() {
		assertTrue(12 == a.getNumberDoor());
	}

	@Test
	public void testSetNumberRoom() {
		b.setNumberDoor(12);
		assertTrue(12 == b.getNumberDoor());
	}

	@Test
	public void testGetType() {
		assertEquals("Standard", a.getType());
	}

	@Test
	public void testSetType() {
		b.setType("Standard");
		assertEquals("Standard", b.getType());
	}

	@Test
	public void testGetSurface() {
		assertTrue(1 == a.getSurface());
	}

	@Test
	public void testSetSurface() {
		b.setSurface(2);
		assertTrue(2 == b.getSurface());
	}

	@Test
	public void testGetFloor() {
		assertTrue(1 == a.getFloor());
	}

	@Test
	public void testSetFloor() {
		b.setFloor(2);
		assertTrue(2 == b.getFloor());
	}

	@Test
	public void testToString() {
		assertEquals("Room numberDoor: " + a.getNumberDoor() + ", type: " + a.getType() + ", surface: " + a.getSurface() + ", floor: " + a.getFloor(), a.toString());
	}

}
