import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int input =0;
		Scanner s = new Scanner(System.in);
		Hotel hotel = new Hotel();
		Reservation reservation = new Reservation(true);
		while(input !=9) {
			System.out.println("Exceptions Example");
			System.out.println("Enter 1 to create reservation [CHECKED EXCEPTION - Multiple Layers]");
			System.out.println("Enter 2 to confirm reservation [UNCHECKED EXCEPTION]");
			System.out.println("Enter 9 to exit");
			input = s.nextInt();
			if(input==1) {
				
				try {
					reservation = hotel.createReservation();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if(input == 2) {
				reservation.confirmReservation();
			}
		}
		
		
		

	}

}
