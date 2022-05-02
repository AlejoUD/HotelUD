package com.mycompany.HotelUD;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;

public class BBDDTest {
	Worker w = new Worker(0,"Ander","45919608W","Male",21);
	User u = new User(0,"Diego","1234567A","Male",21,"COntraseña","11223344");
	Room r = new Room(1, "Premium", 10, 2);
	Dependient d = new Dependient(1, "Paco", "1234567Z", "contra123", "Male", "Manager", "Controlar todo.", "123123456");
	BBDD bd = new BBDD();
	
	@Test
	public void iniBBDDTest() {
		BBDD bd = new BBDD();
	}
	
//	@Test
//	public void testConectionWorkers() {
//		bd.conectionWorkers("HotelUD.sql");
//		bd.conectionRoom("room");
//		bd.conectionUsers("user");
//	}
	
//	@Test
//	public void addWorkersTest() {
//		bd.addWorker(w);
//		
//	}
//	@Test
//	public void addUserTEst() {
//		bd.addUsers(u);
//		
//	}
//	@Test
//	public void addRoomTest() {
//		bd.addRoom(r);
//		
//	}
//	@Test
//	public void addDependientTest() {
//		bd.addDependient(d);
//		
//	}
//	@Test
//	public void getWorkersTest() {
//		bd.getWorkers();
//		
//	}
//	@Test
//	public void getDependientsTest() {
//		bd.getDependients();
//		
//	}
//	@Test
//	public void getUsersTest() {
//		bd.getUsers();
//		
//	}
//	@Test
//	public void getRoomTest() {
//		bd.getRooms();
//		
//	}
//	@Test
//	public void getAsigRoomTest() {
//		bd.getAsigRooms();
//		
//	}
	@Test
	public void getConectionTest() {
		bd.getConection();
		
	}
//	@Test
//	public void asigRommTest() {
//		bd.asigRoom(r, u);
//		
//	}
//	@Test
//	public void conectionWorkers() {
//		bd.conectionUsers("hotel");
//		
//	}
	
}
