package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.mycompany.HotelUD.classes.Menu;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.sun.tools.javac.launcher.Main;


public class MenuTest {
	private static Logger logJava = Logger.getLogger(MenuTest.class);
	@Mock
	List<String> arrayS = new ArrayList<String>();
	
	Menu m = new Menu("Paella","Entrecot","Helado","Agua",arrayS);

	@Before
	public void setUp() {
		m = new Menu("Paella","Entrecot","Helado","Agua",arrayS);
	}

	@Test
	public void testGetters() {
		logJava.info("Esta parte hace test de getters");
		assertEquals("Paella", m.getPlato1());
		assertEquals("Entrecot", m.getPlato2());
		assertEquals("Helado", m.getPostre());
		assertEquals("Agua", m.getBebida());
		//assertEquals("test", m.getCondimento());
		
	}

	@Test
	public void testSetters() {
		logJava.info("Esta parte hace test de setters");
		Menu r = new Menu();
		m.setPlato1("Paella");
		m.setPlato2("Entrecot");
		m.setPostre("Helado");
		m.setBebida("Agua");
		//m.setCondimento(arrayS);
		assertEquals(m.getPlato1(), "Paella");
		assertEquals(m.getPlato2(), "Entrecot");
		assertEquals(m.getPostre(), "Helado");
		assertEquals(m.getBebida(), "Agua");
		//assertEquals(m.getCondimento(), "test");

	}

	@Test
	public void testToString() {
		// Room room = new Room(1, "Premium", 10, 2);
		String expected = "Menu: Primer plato: " + "Paella" + ", segundo plato: " + "Entrecot" + ", postre: " + "Helado" + ", bebida: " + "Agua"	+ ", condimentos" + arrayS + "]"; // put																		// value
																													// here
		assertEquals(expected, m.toString());
	}
}