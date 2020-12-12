import java.io.FileNotFoundException;
import java.io.IOException;

public class SeaViewRoom extends Room {

	public SeaViewRoom() throws FileNotFoundException, IOException {
		super( RoomDAO.getData());
		
	}
	
	

}
