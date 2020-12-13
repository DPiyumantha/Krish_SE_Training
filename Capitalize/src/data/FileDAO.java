package data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileDAO {
	
	public ArrayList<String> getData() throws FileNotFoundException, IOException {
		String str="";
		ArrayList<String> strarr= new ArrayList<String>();
		String path = "./src/data.txt";
		
		FileReader fileReader = null;
		BufferedReader bufferedreader =null;
		
		try {
			fileReader = new FileReader(path);
			bufferedreader = new BufferedReader(fileReader);
			while( (str=bufferedreader.readLine())!=null) {
				strarr.add(str);
			}
			
		} finally {
			if (fileReader!=null) {
				fileReader.close();
			}
			if (bufferedreader!=null) {
				bufferedreader.close();
			}
			
		}
		return strarr;

	}
	

}
