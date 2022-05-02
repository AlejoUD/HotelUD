import static org.junit.Assert.assertEquals;

import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.Worker;

import org.junit.Before;
import org.junit.Test;

public class DependientTest {
 
    private Dependient d;

    @Before
    public void setUp() {
        d = new Dependient(1, "Paco", "1234567Z", "contra123", "Male", "Manager", "Controlar todo.", "123123456");
    }

    @Test
    public void testGetters() {
        assertEquals("Paco", r.getType());
        assertEquals("1234567Z", r.getType());
        assertEquals("contra123", r.getType());
        assertEquals("Male", r.getType());
        assertEquals("Manager", r.getType());
        assertEquals("Controlar todo.", r.getType());
        assertEquals("123123456", r.getType());
    
    }
    @Test
    public void testSetters() {
    	Dependient d = new Dependient();
    	
    	d.setName("test");
    	d.setDni("test");
    	d.setPassword("test");
    	d.setGender("test");
    	d.setPosition("test");
    	d.setDescription("test");
    	d.setBankAccount("test");
    	
    	assertEquals(d.getName(),"test");
    	assertEquals(d.getDni(),"test");
    	assertEquals(d.getPassword(),"test");
    	assertEquals(d.getGender(),"test");
    	assertEquals(d.getPosition(),"test");
    	assertEquals(d.getDescription(),"test");
    	assertEquals(d.getBankAccount(),"test");
    	
    	
    }
}