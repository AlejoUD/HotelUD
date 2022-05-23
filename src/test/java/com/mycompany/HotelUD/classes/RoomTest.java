package com.mycompany.HotelUD.classes;

import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RoomTest {

	// private Room r;

	@Mock
	Room r = new Room(1, "Premium", 10, 2, "No");

	@Before
	public void setUp() {
		r = new Room(1, "Premium", 10, 2, "No");
	}

	@Test
	public void testGetters() {
		assertEquals(1, r.getNumberDoor(), 0.2);
		assertEquals("Premium", r.getType());
		assertEquals(10, r.getSurface(), 0.2);
		assertEquals(2, r.getFloor(), 0.2);
		assertEquals("No", r.getOcupation());
	}

	@Test
	public void testSetters() {
		Room r = new Room();
		r.setFloor(0);
		r.setSurface(0);
		r.setNumberDoor(0);
		r.setType("test");
		r.setOcupation("No");
		assertEquals(r.getFloor(), 0);
		assertEquals(r.getSurface(), 0);
		assertEquals(r.getType(), "test");
		assertEquals(r.getNumberDoor(), 0);
		assertEquals(r.getOcupation(), "No");

	}

	@Test
	public void testToString() {
		// Room room = new Room(1, "Premium", 10, 2, false);
		String expected = "Room number: " + 1 + " | Type: " + "Premium" + " | Surface: " + 10 + " | Floor: " + 2 + " | Occupation: " + "No"; // put
																													// the
																													// expected
																													// value
																													// here
		assertEquals(expected, r.toString());
	}
}