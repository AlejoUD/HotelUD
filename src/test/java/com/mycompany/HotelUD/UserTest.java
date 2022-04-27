import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
 
    private User u;

    @Before
    public void setUp() {
        u = new User(0,"Diego","1234567A","Male",21,"COntraseña","11223344");
    }

    @Test
    public void testGetUser() {
        assertEquals(0,u.getCounter(),0.2);
        assertEquals("Diego",u.getName());
        assertEquals("1234567A",u.getDni());
        assertEquals("Male",u.getGender());
        assertEquals(21,u.getAge(),0.2);
        assertEquals("COntraseña",u.getPassword());
        assertEquals("11223344",u.getBankCount());
    }
}