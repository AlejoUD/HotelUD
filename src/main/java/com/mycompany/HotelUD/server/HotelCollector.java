package com.mycompany.HotelUD.server;

import java.sql.Connection;


import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Ticket;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.AsigRoom;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.BBDD.BDException;

public class HotelCollector {
	
	private ArrayList<Worker> workers= inicializarWorkers();
	private ArrayList<User> users=inicializarUsers();
	private static Logger logJava = Logger.getLogger(HotelCollector.class);

	private ArrayList<Worker> inicializarWorkers(){
		Connection con = null;
		try {
			con = BBDD.initBD();
			workers=BBDD.getWorkers();
		} catch (BDException e1) {
			e1.printStackTrace();
		}
		logJava.info( "Successful in inicialize workers");
		return workers;
		
	}
	
	private ArrayList<User> inicializarUsers(){
	Connection con = null;
	try {
		con = BBDD.initBD();
		users=BBDD.getUsers();
	} catch (BDException e1) {
		e1.printStackTrace();
	}
	logJava.info( "Successful in inicialize users");
	return users;
}

	public ArrayList<Worker> getWorkers() {
		synchronized(this) {
			logJava.info( "Successful getting workers");
			return workers;
			
		}
	}
	
	public ArrayList<User> getUsers() {
		synchronized(this) {
			logJava.info( "Successful getting users");
			return users;
		}
	}
    
	
	public void addWorker(Worker worker) {
        synchronized(this) {
        	Connection con = null;
    		try {
    			con = BBDD.initBD();
    			BBDD.addWorker(worker);
            	workers.add(worker);
            	logJava.info( "Successful in add workers");
    		} catch (BDException e1) {
    			e1.printStackTrace();
    			logJava.error("Error adding workers ");
    		}
        }
    }
	public void addUser(User user) {
        synchronized(this) {

        	Connection con = null;
    		try {
    			con = BBDD.initBD();
    			BBDD.addUsers(user);
            	users.add(user);
            	logJava.info( "Successful in add users");
    		} catch (BDException e1) {
    			e1.printStackTrace();
    			logJava.error("Error adding users ");
    		}
        }
    }

}
