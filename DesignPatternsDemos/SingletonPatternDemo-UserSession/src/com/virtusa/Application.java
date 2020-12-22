package com.virtusa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		long start, end;
		start = System.currentTimeMillis();
		
		Session session=null;
		User user ,user2;
		
		try {
			session = Session.getSession();
			user = session.getUser();
			
			System.out.println("===============================================================");
			System.out.println("First session instance : " + session);
			System.out.println("First user instance : " + user);
			System.out.println(user.displayUser());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("Session user creation took " + (end - start) + " milliseconds");
		System.out.println("===============================================================");
		
		start = System.currentTimeMillis();
		
		
		try {
			Session session2 = Session.getSession();
			user2 = session2.getUser();
			
			System.out.println("Second session instance : " + session2);
			System.out.println("Second user instance : " + user2);
			System.out.println(user2.displayUser());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		
		System.out.println("Session user creation took " + (end - start) + " milliseconds");
		System.out.println("===============================================================");
		
	}

}
