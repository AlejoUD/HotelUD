import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Ticket;
import com.mycompany.HotelUD.classes.User;

import org.junit.Before;
import org.junit.Test;


public class TicketTest {
 
    private Ticket t;
    private User u;
    private Room r;

    @Before
    public void setUp() {
        u = new User(2,"Xabat","73672612P","Male",20,"admin","772367262");
        r = new Room(2, "Normal", 8, 4);
        t = new Ticket(r,u);
    }

    @Test
    public void testGetters() {
        assertEquals(u,t.getUser());
        assertEquals(r,t.getRoom());
    }
    @Test
    public void testSetters() {
    	User user = new User();
    	Room room = new Room();
    	Ticket ticket = new Ticket();
    	ticket.setRoom(room);
    	ticket.setUser(user);
    	assertEquals(ticket.getRoom(),room);
    	assertEquals(ticket.getUser(),user);
    	
    }
//    public void testToString() {
//    	User user = new User();
//    	Room room = new Room();
//    	Ticket ticket = new Ticket();
//    	assertEquals("Ticket: All the room features->" + room.toString() + ". User features->"+ user.toString(),ticket.toString());
//    	
//    }
    
}