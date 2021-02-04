package com.dimalka;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Reservation {
	
	Room room;
	public Reservation(boolean b) {
		
	}
	
	public Reservation() throws FileNotFoundException, IOException {
		this.room = new SeaViewRoom();
	}
	
	public void confirmReservation() {
		int payment =0;
		double randomValue =0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please pay  300 (Enter 0 to get unchecked exception)");
		payment = scanner.nextInt();
		//just dividing by payment to get an Arithmatic exception here
		randomValue=10/payment;
		if(payment!=300 && payment!=0) {
			System.out.println("Your reservation is not confirmed. Refunded : "+payment);
		}else {
		System.out.println("Your reservation is confirmed");
		}
	}
	

}
