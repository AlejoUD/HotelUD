package main.java.es.deusto.spq;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
    		
    		System.out.println("Conexion OK");
    		}catch (SQLException e) {
				// TODO: handle exception
    			System.out.println("Error en la conexion");
    			e.printStackTrace();
    		}
    	
    }
    
}
