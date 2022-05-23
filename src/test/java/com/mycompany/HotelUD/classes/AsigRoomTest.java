package com.mycompany.HotelUD.classes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycompany.HotelUD.classes.AsigRoom;
import com.mycompany.HotelUD.classes.Room;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AsigRoomTest {
	private AsigRoom a;
	
	@Mock
	Room r = new Room(1, "Premium", 10, 2, "Yes");

	@Before
	public void setUp() {
		
		a = new AsigRoom(r , "1234567A", "00-00-0000");
		
	}

	@Test
	public void testGetters() {
		
		assertEquals(r, a.getRoom());
		assertEquals("1234567A", a.getDni());
		assertEquals("00-00-0000", a.getFecha());
	
	}

	@Test
	public void testSetters() {
		Room room = new Room();
		AsigRoom asigRoom = new AsigRoom();
		asigRoom.setRoom(room);
		asigRoom.setDni("1234567B");
		asigRoom.setFecha("00-00-0000");
		
		assertEquals(asigRoom.getRoom(), room);
		assertEquals(asigRoom.getDni(), "1234567B");
		assertEquals(asigRoom.getFecha(), "00-00-0000");

	}

	@Test
	public void testToString() {
		Room r1 = new Room();
		AsigRoom a= new AsigRoom();
		a.setRoom(r1);
		a.setDni("1234567B");
		String exp = "Rooms information: " + r1.toString() + ", DNI: " + a.getDni() + ", fecha: " + a.getFecha();

		assertEquals(exp, a.toString());
	}
	
}
