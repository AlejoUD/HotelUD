import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;


public class WorkerTest {
 
    private Worker w;

    @Before
    public void setUp() {
        w = new Worker(0,"Ander","45919608W","Male",21);
    }

    @Test
    public void testGetUser() {
        assertEquals(0,u.getCounter(),0.2);
        assertEquals("Ander",u.getName());
        assertEquals("45919608W",u.getDni());
        assertEquals("Male",u.getGender());
        assertEquals(21,u.getAge(),0.2);
    }
}