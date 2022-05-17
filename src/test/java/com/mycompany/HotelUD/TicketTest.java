package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Ticket;
import com.mycompany.HotelUD.classes.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TicketTest {

	private Ticket t;
	@Mock
	User u = new User(2, "Xabat", "73672612P", "Male", 20, "admin", "772367262");
	@Mock
	Room r = new Room(2, "Normal", 8, 4, "Yes");
	

	@Before
	public void setUp() {
		//u = new User(2, "Xabat", "73672612P", "Male", 20, "admin", "772367262");
		//r = new Room(2, "Normal", 8, 4);
		t = new Ticket(r, u);
	}

	@Test
	public void testGetters() {
		assertEquals(u, t.getUser());
		assertEquals(r, t.getRoom());
	}

	@Test
	public void testSetters() {
		User user = new User();
		Room room = new Room();
		Ticket ticket = new Ticket();
		ticket.setRoom(room);
		ticket.setUser(user);
		assertEquals(ticket.getRoom(), room);
		assertEquals(ticket.getUser(), user);

	}

	@Test
	public void testToString() {
		Room r1 = new Room();
		User u1 = new User();
		Ticket ticket = new Ticket(r1, u1);
		String expected = "Ticket: All the room features->" + r1.toString() + ". User features->" + u1.toString(); // put
																													// the
																													// expected
																													// value
																													// here
		assertEquals(expected, ticket.toString());
	}

}