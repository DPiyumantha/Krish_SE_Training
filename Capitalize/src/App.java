import java.io.IOException;

public class App { 

	public static void main(String[] args) {
		FileDAO file = new FileDAO();
		try {
			file.getData();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
