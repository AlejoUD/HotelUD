package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Ticket;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WorkerTest {

	// private Worker w;

	@Mock
	Worker w = new Worker(0, "Ander", "45919608W", "Male", 21);

	@Before
	public void setUp() {
		w = new Worker(0, "Ander", "45919608W", "Male", 21);
	}

	@Test
	public void testGetUser() {
		assertEquals(0, w.getCounter(), 0.2);
		assertEquals("Ander", w.getName());
		assertEquals("45919608W", w.getDni());
		assertEquals("Male", w.getGender());
		assertEquals(21, w.getAge(), 0.2);
	}

	@Test
	public void testSetters() {
		Worker w = new Worker();
		w.setAge(0);
		w.setCounter(0);
		w.setDni("test");
		w.setGender("test");
		w.setName("test");
		assertEquals(w.getAge(), 0);
		assertEquals(w.getCounter(), 0);
		assertEquals(w.getDni(), "test");
		assertEquals(w.getGender(), "test");
		assertEquals(w.getName(), "test");

	}

	@Test
	public void testToString() {
		// Worker worker = new Worker(1, "name", "dni", "gender", 21);
		String expected = "Worker code" + 0 + ", name: " + "Ander" + ", dni: " + "45919608W" + ", gender: " + "Male"
				+ ", age: " + 21; // put the expected value here
		assertEquals(expected, w.toString());
	}
}
