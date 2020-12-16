package com.virtusa;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RoomDAO {
	
	public static int getData() throws FileNotFoundException, IOException {
		int number;
		String path = "./src/data.txt";
		
		FileReader fileReader = null;
		BufferedReader bufferedreader =null;
		
		try {
			fileReader = new FileReader(path);
			bufferedreader = new BufferedReader(fileReader);
			number=Integer.valueOf(bufferedreader.readLine());
			return number;
		} finally {
			if (fileReader!=null) {
				fileReader.close();
			}
			if (bufferedreader!=null) {
				bufferedreader.close();
			}
			
		}

	}
	

}
