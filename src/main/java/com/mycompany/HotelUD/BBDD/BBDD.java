package com.mycompany.HotelUD.BBDD;

import java.awt.print.Printable;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import com.mycompany.HotelUD.classes.AsigRoom;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.Menu;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

public class BBDD {
	public static Connection connection;
	public static PreparedStatement statement;
	
//	public static Connection initBD(String nombreBD) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(url,usuario,password);
//			System.out.println("Conexion realizada");
//			return connection;
//		} catch (ClassNotFoundException | SQLException e) {
//			return null;
//		}
//	}
	
//	public static Connection initBD(String nombreBD) throws BDException {
//		Connection con = null;
//		try {
//			Class.forName("org.sqlite.JDBC");
//			con = DriverManager.getConnection("jdbc:sqlite:"+nombreBD);
//			
//					
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//			throw new BDException("No se pudo cargar el driver de la base de datos", e);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return con;
//	}
	
	
	public BBDD() {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
				System.out.println("Conexion realizada");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static void conectionWorkers(String nombreBD) {
		try {
			statement = (PreparedStatement) connection.createStatement();
			try {
				statement.executeUpdate("create table " + nombreBD
						+ " (counter integer primary key autoincrement, name varchar, dni varchar, gender varchar, age integer )");
			} catch (SQLException e) {
				System.out.println("Ya esta creada");
			}
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}
	
	public static void conectionUsers(String nombreBD) {
		try {
			statement = (PreparedStatement) connection.createStatement();
			try {
				statement.executeUpdate("create table " + nombreBD
						+ " (counter integer primary key autoincrement, name varchar, surname varchar, dni varchar, gender varchar, age integer, bankCount varchar)");
			} catch (SQLException e) {
				System.out.println("Ya esta creada");
			}
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}
	
	public static void conectionRoom(String nombreBD) {
		try {
			statement = (PreparedStatement) connection.createStatement();
			try {
				statement.executeUpdate("create table " + nombreBD
						+ " (numberDoor integer primary key autoincrement, type varchar, surface integer, floor integer, ocupation varchar)");
			} catch (SQLException e) {
				System.out.println("Ya esta creada");
			}
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}
	
	public Connection getConection() {
		return connection;
	}
	
	public static void addWorker(Worker worker) {
		try {
			statement = connection.prepareStatement("INSERT INTO workers (counter,name,dni,gender,age) VALUES ( ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, 0);
			statement.setString(2, worker.getName());
			statement.setString(3, worker.getDni());
			statement.setString(4, worker.getGender());
			statement.setLong(5, worker.getAge());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addUsers(User user) {
		try {
			statement = connection.prepareStatement("INSERT INTO users (counter,name,password,dni,gender,age,bankCount) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, 0);
			statement.setString(2, user.getName());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getDni());
			statement.setString(5, user.getGender());
			statement.setLong(6, user.getAge());
			statement.setString(7, user.getBankCount());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addRoom(Room room) {
		try {
			statement = connection.prepareStatement("INSERT INTO room (numberDoor,type,surface,floor,ocupation) VALUES ( ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, room.getNumberDoor());
			statement.setString(2, room.getType());
			statement.setLong(3, room.getSurface());
			statement.setLong(4, room.getFloor());
			statement.setString(5, room.getOcupation());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void asigRoom(Room room, User user) {
		try {
			statement = connection.prepareStatement("INSERT INTO roomAsig (numberDoor,type,surface,floor, dni) VALUES ( ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, 0);
			statement.setString(2, room.getType());
			statement.setLong(3, room.getSurface());
			statement.setLong(4, room.getFloor());
			statement.setString(5, user.getDni());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Worker> getWorkers() {
		ArrayList<Worker> result = new ArrayList<Worker>();
		String consult = "SELECT * FROM workers";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				Worker worker2 = new Worker();
				worker2.setCounter(rs.getInt(1));
				worker2.setName(rs.getString(2));
				worker2.setDni(rs.getString(3));
				worker2.setGender(rs.getString(4));
				worker2.setAge(rs.getInt(5));
				result.add(worker2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	public static ArrayList<User> getUsers() {
		ArrayList<User> result = new ArrayList<User>();
		String consult = "SELECT * FROM users";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				User user2 = new User();
				user2.setCounter(rs.getInt(1));
				user2.setName(rs.getString(2));
				user2.setPassword(rs.getString(3));
				user2.setDni(rs.getString(4));
				user2.setGender(rs.getString(5));
				user2.setAge(rs.getInt(6));
				user2.setBankCount(rs.getString(7));
				result.add(user2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	public static ArrayList<Room> getRooms() {
		ArrayList<Room> result = new ArrayList<Room>();
		String consult = "SELECT * FROM room";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				Room room2 = new Room();
				room2.setNumberDoor(rs.getInt(1));
				room2.setType(rs.getString(2));
				room2.setSurface(rs.getInt(3));
				room2.setFloor(rs.getInt(4));
				room2.setOcupation(rs.getString(5));
				result.add(room2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	public static ArrayList<AsigRoom> getAsigRooms() {
		ArrayList<AsigRoom> result = new ArrayList<AsigRoom>();
		String consult = "SELECT * FROM roomAsig";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				Room room2 = new Room();
				AsigRoom asigRoom2 = new AsigRoom();
				room2.setNumberDoor(rs.getInt(1));
				room2.setType(rs.getString(2));
				room2.setSurface(rs.getInt(3));
				room2.setFloor(rs.getInt(4));
				room2.setOcupation(rs.getString(5));
				asigRoom2.setRoom(room2);
				asigRoom2.setDni(rs.getString(6));
				
				
				result.add(asigRoom2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	
	
	public static void addDependient(Dependient dependient) {
		try {
			statement = connection.prepareStatement("INSERT INTO dependients (counter,name,dni,password,gender,position,description,bankAccount) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, 0);
			statement.setString(2, dependient.getName());
			statement.setString(3, dependient.getDni());
			statement.setString(4, dependient.getPassword());
			statement.setString(5, dependient.getGender());
			statement.setString(6, dependient.getPosition());
			statement.setString(7, dependient.getDescription());
			statement.setString(8, dependient.getBankAccount());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Dependient> getDependients() {
		ArrayList<Dependient> result = new ArrayList<Dependient>();
		String consult = "SELECT * FROM dependients";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				Dependient dependient2 = new Dependient();
				dependient2.setCounter(rs.getInt(1));
				dependient2.setName(rs.getString(2));
				dependient2.setDni(rs.getString(3));
				dependient2.setPassword(rs.getString(4));
				dependient2.setGender(rs.getString(5));
				dependient2.setPosition(rs.getString(6));
				dependient2.setDescription(rs.getString(7));
				dependient2.setBankAccount(rs.getString(8));
				result.add(dependient2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	public static void addMenu(Menu menu) {
		try {
			String news = "";
			statement = connection.prepareStatement("INSERT INTO menu (counter,Plato1,Plato2,Postre,Bebida,Condimentos) VALUES ( ?, ?, ?, ?, ?, ?)");
			Statement st= connection.createStatement();
			statement.setLong(1, 0);
			statement.setString(2, menu.getPlato1());
			statement.setString(3, menu.getPlato2());
			statement.setString(4, menu.getPostre());
			statement.setString(5, menu.getBebida());
			for (String s : menu.getCondimento()) {
				news = s + ", ";
			}
			statement.setString(6, news);
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Menu> getMenu() {
		ArrayList<Menu> result = new ArrayList<Menu>();
		String consult = "SELECT * FROM menu";
		try {
			ResultSet rs = connection.createStatement().executeQuery(consult);
			while(rs.next()) {
				Menu menu2 = new Menu();
				menu2.setPlato1(rs.getString(2));
				menu2.setPlato2(rs.getString(3));
				menu2.setPostre(rs.getString(4));
				menu2.setPostre(rs.getString(5));
				List<String> list = new ArrayList<>();
				list.add(rs.getString(6));
				menu2.setCondimento(list);
				result.add(menu2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	

}
