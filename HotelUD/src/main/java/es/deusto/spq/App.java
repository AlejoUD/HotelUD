package main.java.es.deusto.spq;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!!!!" );
    	try {
 
    		DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","");
    		
    		System.out.println("Conexión OK");
    		
    		}catch (SQLException e) {
				// TODO: handle exception
    			System.out.println("Error en la conexión");
    			e.printStackTrace();
			}
    	
    }
    
}
