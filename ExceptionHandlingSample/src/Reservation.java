import java.io.FileNotFoundException;
import java.io.IOException;

public class Reservation {
	
	Room room;
	
	public Reservation() throws FileNotFoundException, IOException {
		this.room = new SeaViewRoom();
	}
	

}
