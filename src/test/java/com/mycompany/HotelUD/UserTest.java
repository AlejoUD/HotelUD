package com.mycompany.HotelUD;

import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
 
    private User u;

    @Before
    public void setUp() {
        u = new User(0,"Diego","1234567A","Male",21,"COntraseña","11223344");
    }

    @Test
    public void testGetUser() {
        assertEquals(0,u.getCounter(),0.2);
        assertEquals("Diego",u.getName());
        assertEquals("1234567A",u.getDni());
        assertEquals("Male",u.getGender());
        assertEquals(21,u.getAge(),0.2);
        assertEquals("COntraseña",u.getPassword());
        assertEquals("11223344",u.getBankCount());
    }
    @Test
    public void testSetters() {
    	User u = new User();
    	u.setAge(0);
    	u.setCounter(0);
    	u.setDni("test");
    	u.setGender("test");
    	u.setName("test");
    	u.setBankCount("test");
    	u.setPassword("test");
    	
    	assertEquals(u.getAge(),0);
    	assertEquals(u.getCounter(),0);
    	assertEquals(u.getDni(),"test");
    	assertEquals(u.getGender(),"test");
    	assertEquals(u.getName(),"test");
    	assertEquals(u.getBankCount(),"test");
    	assertEquals(u.getPassword(),"test");
    }
}