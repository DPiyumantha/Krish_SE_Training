package logical;

import java.util.ArrayList;

public class Case {
	
	public static ArrayList<String> capitalizeAll(ArrayList<String> stringarr) {
		ArrayList<String> stringLines = new ArrayList<String>();
		stringarr.forEach((s)->{
			stringLines.add(s.toUpperCase());
		});
		
		return stringLines;
		
	}

}
