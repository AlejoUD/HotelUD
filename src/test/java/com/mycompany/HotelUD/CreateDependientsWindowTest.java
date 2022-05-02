import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import com.mycompany.HotelUD.BBDD.BBDD;
import com.mycompany.HotelUD.classes.Dependient;
import com.mycompany.HotelUD.classes.Room;
import com.mycompany.HotelUD.classes.User;
import com.mycompany.HotelUD.classes.Worker;
import com.mycompany.HotelUD.client.AsigClientRoomWindow;
import com.mycompany.HotelUD.client.CreateDependientsWindow;
import com.mycompany.HotelUD.server.WindowServer;

import org.junit.Before;
import org.junit.Test;
public class CreateDependientsWindowTest {
	@Test
	public void openWindowTest() {
		CreateDependientsWindow ws = new CreateDependientsWindow();
	}
}
