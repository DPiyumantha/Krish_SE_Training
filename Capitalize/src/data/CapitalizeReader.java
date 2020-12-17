package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class CapitalizeReader extends BufferedReader {

	public CapitalizeReader(Reader in) {
		super(in);
	}
	@Override
	public String readLine() throws IOException {
		String string = super.readLine();
		if(string!=null) {
			return string.toUpperCase();
		}else {
			return null;
		}
	}


}
