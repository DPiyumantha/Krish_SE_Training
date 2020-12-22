package com.virtusa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserDAO {

	public static User getUser() throws FileNotFoundException, IOException {
		String username, email;
		User user = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String path = "./src/com/virtusa/data.txt";

		try {
			fileReader = new FileReader(path);
			bufferedReader = new BufferedReader(fileReader);
			username = bufferedReader.readLine();
			email = bufferedReader.readLine();
			if(username==null || email==null) {
				throw new IOException("No user data exist. Please log in");
			}
			user = new User(username, email);
			return user;
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
	}

}
