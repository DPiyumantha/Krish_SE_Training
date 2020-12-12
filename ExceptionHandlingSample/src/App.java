import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		try {
			hotel.createReservation();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
