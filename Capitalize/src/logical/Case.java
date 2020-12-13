package logical;

import java.util.ArrayList;
import java.util.HashMap;

public class Case {
	
	//this was my original solution but later i switched to hashmap
	public static ArrayList<String> capitalizeAll(ArrayList<String> stringarr) {
		ArrayList<String> stringLines = new ArrayList<String>();
		stringarr.forEach((s)->{
			stringLines.add(s.toUpperCase());
		});
		
		return stringLines;
		
	}

	public static String capita(String s) {
		String str ="";
		char[] arr = new char[s.length()];
		HashMap<Character, Character> alphabet = new HashMap<Character,Character>();
		alphabet.put('a','A');
		alphabet.put('b','B');
		alphabet.put('c','C');
		alphabet.put('d','D');
		alphabet.put('e','E');
		alphabet.put('f','F');
		alphabet.put('g','G');
		alphabet.put('h','H');
		alphabet.put('i','I');
		alphabet.put('j','J');
		alphabet.put('k','K');
		alphabet.put('l','L');
		alphabet.put('m','M');
		alphabet.put('n','N');
		alphabet.put('o','O');
		alphabet.put('p','P');
		alphabet.put('q','Q');
		alphabet.put('r','R');
		alphabet.put('s','S');
		alphabet.put('t','T');
		alphabet.put('u','U');
		alphabet.put('v','V');
		alphabet.put('w','W');
		alphabet.put('x','X');
		alphabet.put('y','Y');
		alphabet.put('z','Z');
		arr =s.toCharArray();
		for(int i=0; i<s.length();i++) {
			if(alphabet.containsKey(arr[i])) {
				arr[i] = alphabet.get(arr[i]);
			}
		}
		
		for(int i=0; i<s.length();i++) {
			str+=arr[i];
		}
		return str;
		
	}

}
