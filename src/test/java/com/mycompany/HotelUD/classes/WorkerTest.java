package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class WorkerTest {

	private Worker w;

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
		w.setAge(21);
		w.setCounter(0);
		w.setDni("45919608W");
		w.setGender("Male");
		w.setName("Ander");
		assertEquals(w.getAge(), 21);
		assertEquals(w.getCounter(), 0);
		assertEquals(w.getDni(), "45919608W");
		assertEquals(w.getGender(), "Male");
		assertEquals(w.getName(), "Ander");

	}

	@Test
	public void testToString() {
		// Worker worker = new Worker(1, "name", "dni", "gender", 21);
		String expected = "Worker code" + 0 + ", name: " + "Ander" + ", dni: " + "45919608W" + ", gender: " + "Male"
				+ ", age: " + 21; // put the expected value here
		assertEquals(expected, w.toString());
	}
}
