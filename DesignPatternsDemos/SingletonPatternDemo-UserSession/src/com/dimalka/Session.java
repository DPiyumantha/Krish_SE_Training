package com.dimalka;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Session {

	private static volatile Session session;
	private static volatile User user;

	private Session(){
		if (session != null) {
			throw new RuntimeException("Use Session.getSession()");
		}

	}

	public static Session getSession() throws FileNotFoundException, IOException {
		if (session == null) {
			synchronized (Session.class) {
				if (session == null) {
					session = new Session();
				}
			}
		}

		return session;
	}

	public User getUser() throws FileNotFoundException, IOException {
		if (user == null) {
			synchronized (Session.class) {
				if (user == null) {
					user = UserDAO.getUser();
				}
			}
		}
		return user;

	}

}
