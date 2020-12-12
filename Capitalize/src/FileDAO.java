import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileDAO {
	
	public void getData() throws IOException {
		String res,str="";
		String path = "./src/data.txt";
		
		FileReader fileReader = null;
		BufferedReader bufferedreader =null;
		
		try {
			fileReader = new FileReader(path);
			bufferedreader = new BufferedReader(fileReader);
			while( (str=bufferedreader.readLine())!=null) {
				res=str.toUpperCase();
				System.out.println("[CAPITALIZED]"+res);
				System.out.println("[ORIGINAL]"+str);
			}
			
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
