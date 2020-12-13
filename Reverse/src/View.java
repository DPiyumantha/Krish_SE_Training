import java.util.Scanner;

public class View {
	
	public static long getInput() {
		long input=0l;
		Scanner s = new Scanner(System.in);
		System.out.print("Please input an integer (Supports long upto 999999999999999) : ");
		input = s.nextLong();
		return input;
	}
	
	public static void printResult(long input, long output) {
		System.out.println("---------------------------");
		System.out.println("User Input : "+ input);
		System.out.println("Reversed Number : "+ output);
		System.out.println("---------------------------");
	}

}
