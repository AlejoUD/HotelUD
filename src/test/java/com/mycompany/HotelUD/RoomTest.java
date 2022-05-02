import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
 
    private Room r;

    @Before
    public void setUp() {
        r = new Room(1, "Premium", 10, 2);
    }

    @Test
    public void testGetName() {
        assertEquals(1, r.getNumberDoor(), 0.2);
        assertEquals("Premium", r.getType());
        assertEquals(10, r.getSurface(), 0.2);
        assertEquals(2, r.getFloor(), 0.2);
    }
    @Test
    public void testSetters() {
    	Room r = new Room();
    	r.setFloor(0);
    	r.setSurface(0);
    	r.setNumberDoor(0);
    	r.setType("test");
    	assertEquals(r.getFloor(),0);
    	assertEquals(r.getSurface(),0);
    	assertEquals(r.getType(),"test");
    	assertEquals(r.getNumberDoor(),0);
    	
    }
    @Test
    public void testToString()
    {
        Room room = new Room(1, "Premium", 120, 2); 
        String expected = "Room numberDoor: " + 1 + ", type: " + "Premium" + ", surface: " + 120 + ", floor: " + 2; // put the expected value here
        assertEquals(expected, room.toString());
    }
}