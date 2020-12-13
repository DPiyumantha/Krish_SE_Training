import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		long input = View.getInput();
		long num =input;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int length =0;
		long rev=0l;
		int[] arr;
		if(input<=999999999999999L) {
		//calculating the number of digits
		length = Calculate.getNumberOfDigits(input);
		//separating the digits mathematically
		digits = Calculate.getSeperateDigits(num, length);
		arr= new int[length];
		//reversing the digits array
		for(int i=length-1; i>=0; i--) {
			arr[length-1-i]=digits.get(length-1-i);
		}
		//multiply the digits by multiples of 10 and add, so that they are placed accordingly
		for(int i=length-1; i>=0;i--) {
			rev+=(long)arr[i]*Calculate.getPow(10, i);
		}
		//type is used as long to support lengthy numbers
		long finalResult = rev;
		
		View.printResult(input, finalResult);
		}else {
			System.out.println("Input value exceeded 999999999999999");
		}
		

	}

}
