import java.io.IOException;
import java.util.ArrayList;

import data.FileDAO;
import logical.Case;
import view.Interaction;

public class App { 

	public static void main(String[] args) {
		ArrayList<String> stringLines, capitalisedStrings = new ArrayList<String>();
		FileDAO textDAO= new FileDAO();
		try {
			//Read data from file
			stringLines = textDAO.getData();
			
			//Pass original data and get capitalised data
			capitalisedStrings = Case.capitalizeAll(stringLines);
			
			//Print out the capitalised data, along with the original
			//pass only capitalised data to print capitalised data only
			Interaction.printResult(stringLines, capitalisedStrings);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
