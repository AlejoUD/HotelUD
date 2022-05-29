package com.mycompany.HotelUD.BBDD;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.ArrayList;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
@PerfTest(invocations = 400, threads = 20)
@Required(max = 3000, average = 500)
public class BBDDTest {
	@Rule 
	public ContiPerfRule rule = new ContiPerfRule();

	Worker w = new Worker(0, "Ander", "45919608W", "Male", 21);
	User u = new User(0, "Diego", "1234567A", "Male", 21, "COntraseña", "11223344");
	Room r = new Room(1, "Premium", 10, 2, "Yes");
	Dependient d = new Dependient(1, "Paco", "1234567Z", "contra123", "Male", "Manager", "Controlar todo.",
			"123123456");
	BBDD bd = org.mockito.Mockito.mock(BBDD.class);
	Connection con = null;

	@Test
	public void iniBBDDTest() {
		try {
			bd.initBD("Hotel");
		} catch (BDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testEquals() {
		
		assertTrue(u.getAge() == u.getAge());
		assertTrue(u.getBankCount() == u.getBankCount());
		assertTrue(u.getDni() == u.getDni());
		assertTrue(u.getGender() == u.getGender());
		assertTrue(u.getName() == u.getName());
		assertTrue(u.getPassword() == u.getPassword());
	
		
	}

	@Test
	public void getUsersTest(){
		ArrayList<User> au = new ArrayList<>();
		au.add(u);
		assertEquals(u.getDni(), au.get(0).getDni());
	}
	

}
