package test.java.es.deusto.spq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import classes.User;

public class UserTest {

	User a = new User(0, "Diego", "12345678Z", "Male", 20, "Burzaco", "11223344");
	User b = new User();

	@Test
	public void testGetName() {
		assertEquals("Diego", a.getName());
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
	public void testGetSurname() {
		assertEquals("Burzaco", a.getSurname());
	}

	@Test
	public void testSetSurname() {
		b.setSurname("Plaza");
		assertEquals("Plaza", b.getSurname());
	}

	@Test
	public void testGetBankAcount() {
		assertEquals("Diego", a.getName());
	}

	@Test
	public void testSetBankAcount() {
		b.setBankCount("11223344");
		assertEquals("11223344", b.getBankCount());
	}

	@Test
	public void testToString() {
		assertEquals(
				"User code " + 0 + " name: " + a.getName() + ", dni: " + a.getDni() + ", gender: " + a.getGender()
						+ ", age: " + a.getAge() + ", surname: " + a.getSurname() + ", bankCount: " + a.getBankCount(),
				a.toString());
	}

}
