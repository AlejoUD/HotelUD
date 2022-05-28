package com.mycompany.HotelUD.server;

import org.apache.log4j.Logger;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import com.mycompany.HotelUD.classes.Worker;
import com.mycompany.HotelUD.classes.MenuTest;
import com.mycompany.HotelUD.classes.User;

@PerfTest(invocations = 5)
@Required(max = 1200, average = 250)
public class HotelServerTest {
	private static Logger logJava = Logger.getLogger(HotelServerTest.class);
    private HotelCollector hotelCollector;

    private Worker worker;
    private User user;
    

    @Rule public ContiPerfRule rule = new ContiPerfRule();
   
    @Before public void setUp(){
    	logJava.info("Se hace setup");
        hotelCollector = new HotelCollector();
        worker = new Worker(1, "Juan", "123456789", "Male", 21);
        user = new User(1, "Diego", "987654321", "Male", 21, "123", "1234567890");
    }

//	@Test
//	public void TestaddWorker() {
//		logJava.info("Test add worker");
//		//Response expected = 
//        //assertEquals(expected, hotelCollector.addWorker(worker));
//	}
//
//	@Test
//	public void TestgetWorkers() {
//		logJava.info("Test get worker");
//	}
//
//	@Test
//	public void TestaddUser() {
//		logJava.info("Test add User");
//		hotelCollector.addUser(user);
//	}
//
//	@Test
//	public void TestgetUsers() {
//
//	}
}
