package data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileDAO {
	
	public ArrayList<String> getData() throws FileNotFoundException, IOException {
		String str="";
		ArrayList<String> strarr= new ArrayList<String>();
		String path = "./src/data.txt";
		CapitalizeReader capitalizeReader=null;
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(path);
			capitalizeReader = new CapitalizeReader(fileReader);
			while( (str=capitalizeReader.readLine())!=null) {
				strarr.add(str);
			}
			
		} finally {
			if (fileReader!=null) {
				fileReader.close();
			}
			if (capitalizeReader!=null) {
				capitalizeReader.close();
			}
			
		}
		return strarr;

	}
	

}
