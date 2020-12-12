import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RoomDAO {
	
	public static int getData() throws FileNotFoundException, IOException {
		int n;
		String path = "./src/data.txt";
		
		FileReader fileReader = null;
		BufferedReader bufferedreader =null;
		
		try {
			fileReader = new FileReader(path);
			bufferedreader = new BufferedReader(fileReader);
			n=Integer.valueOf(bufferedreader.readLine());
			return n;
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
