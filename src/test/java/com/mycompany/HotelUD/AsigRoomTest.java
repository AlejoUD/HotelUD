package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.HotelUD.classes.AsigRoom;

public class AsigRoomTest {
	private AsigRoom a;

	@Before
	public void setUp() {
		a = new AsigRoom(1, "Premium", 10, 2, "1234567A");
	}

	@Test
	public void testGetters() {
		assertEquals(1, a.getNumberDoor());
		assertEquals("Premium", a.getType());
		assertEquals(10, a.getSurface());
		assertEquals(2, a.getFloor());
		assertEquals("1234567A", a.getDni());
	}

	@Test
	public void testSetters() {
		AsigRoom a = new AsigRoom();
		a.setFloor(0);
		a.setSurface(0);
		a.setNumberDoor(0);
		a.setType("Premium");
		a.setDni("1234567B");

		assertEquals(a.getFloor(), 0);
		assertEquals(a.getSurface(), 0);
		assertEquals(a.getType(), "Premium");
		assertEquals(a.getNumberDoor(), 0);
		assertEquals(a.getDni(), "1234567B");

	}

	@Test
	public void testToString() {
		String exp = "Room numberDoor: " + a.getNumberDoor() + ", type: " + a.getType() + ", surface: " + a.getSurface()
				+ ", floor: " + a.getFloor() + ", DNI: " + a.getDni();

		assertEquals(exp, a.toString());
	}
}
