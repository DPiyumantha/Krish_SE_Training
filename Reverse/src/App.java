import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		long input = View.getInput();
		long num =input;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		ArrayList<Integer> digitstemp = new ArrayList<Integer>();
		int length =0;
		long rev=0l;
		int[] arr;
		
		//calculating the number of digits
		//can not support more than 8 digits because i cannot hold more than 1000000000 in multiple of 10
		//can not use long because i don't know how to access array items using long type index
		
		length = Calculate.getNumberOfDigits(input);
		
		
		
		
		
		digits = Calculate.getSeperateDigits(num, length);
		
		
		
//		if(Calculate.getNumberOfDigits((digits.get(0)))>1) {
//			//System.out.println("More than 8");
//			int lengthtemp = Calculate.getNumberOfDigits(digits.get(0));
//			digitstemp = Calculate.getSeperateDigits(digits.get(0), lengthtemp);
//			digits.remove(0);
//			digits.addAll(0, digitstemp);
//			length=length-1+lengthtemp;
//		}
		arr= new int[length];
		//reversing the digits array
		for(int i=length-1; i>=0; i--) {
			arr[length-1-i]=digits.get(length-1-i);
		}
		
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
		
		//multiply the digits by multiples of 10 and add, so that they are placed accordingly
		for(int i=length-1; i>=0;i--) {
			rev+=(long)arr[i]*Calculate.getPow(10, i);
//			System.out.println(arr[i]+" "+i +" "+rev );
		}
//		long longnum=Calculate.getPow(10, 16);
//		System.out.println(longnum);
		long finalResult = rev;
		
		View.printResult(input, finalResult);
		
		

	}

}
