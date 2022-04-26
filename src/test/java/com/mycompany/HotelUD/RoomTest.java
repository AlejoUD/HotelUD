import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
 
    private Room u;

    @Before
    public void setUp() {
        u = new Room(1, "Premium", 10, 2);
    }

    @Test
    public void testGetName() {
        assertEquals(1, u.getNumberDoor(), 0.2);
        assertEquals("Premium", u.getType());
        assertEquals(10, u.getSurface(), 0.2);
        assertEquals(2, u.getFloor(), 0.2);
    }
}