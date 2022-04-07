package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mycompany.HotelUD.classes.Worker;

public class WorkerTest {

	Worker a = new Worker(0, "Ander", "12345678Z", "Male", 20);
	Worker b = new Worker();

	@Test
	public void testGetName() {
		assertEquals("Ander", a.getName());
	}

	@Test
	public void testSetName() {
		b.setName("Xa1");
		assertEquals("Xa1", b.getName());
	}

	@Test
	public void testGetDni() {
		assertEquals("12345678Z", a.getDni());
	}

	@Test
	public void testSetDni() {
		b.setDni("12345678Z");
		assertEquals("12345678Z", b.getDni());
	}

	@Test
	public void testGetGender() {
		assertEquals("Male", a.getGender());
	}

	@Test
	public void testSetGender() {
		b.setGender("Female");
		assertEquals("Female", b.getGender());
	}

	@Test
	public void testGetAge() {
		assertEquals(20, a.getAge());
	}

	@Test
	public void testSetAge() {
		b.setAge(21);
		assertEquals(21, b.getAge());
	}

	@Test
	public void testToString() {
		assertEquals("Worker code" + 0 + ", name: " + a.getName() + ", dni: " + a.getDni() + ", gender: "
				+ a.getGender() + ", age: " + a.getAge(), a.toString());
	}

}
