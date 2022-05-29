package com.mycompany.HotelUD.server;

import static org.junit.Assert.*;


import java.sql.Connection;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.log4j.Logger;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.BBDD.BDException;
import com.mycompany.HotelUD.classes.Worker;
import com.mycompany.HotelUD.client.StartWindow;
import com.mycompany.HotelUD.server.HotelServerTest;

@PerfTest(invocations = 5)
@Required(max = 1200, average = 250)
public class CrearWorkerTest {
		BBDD bd;
		Client client;
		WebTarget webTarget;
		Worker worker;
		Connection con =null;
		StartWindow inicio;
		private static Logger logJava = Logger.getLogger(CrearWorkerTest.class);
		@Rule public ContiPerfRule rule = new ContiPerfRule();

		@Before
		public void setUp() {
			logJava.info("Se hace setup");
			bd=new BBDD();
			client = ClientBuilder.newClient();
			webTarget = client.target(String.format("http://%s:%s/rest", "127.0.0.1", 8080));
			worker=new Worker(0, "Ander", "45919608W", "Male", 21);
			try {
				con = bd.initBD();
			} catch (BDException e) {
				e.printStackTrace();
			}

		}
	}
