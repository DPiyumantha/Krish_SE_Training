package view;
import java.util.ArrayList;


public class Interaction {
	
	public static void printResult(ArrayList<String> stringArr){
		stringArr.forEach((s->System.out.println("[CAPITALIZED : ]"+s)));
		
	}
	
	public static void printResult(ArrayList<String> originalstringArr, ArrayList<String> stringArr){
		stringArr.forEach((s->System.out.println("[CAPITALIZED]: "+s)));
		originalstringArr.forEach((s->System.out.println("[ORIGINAL]: "+s)));
		
	}

}
