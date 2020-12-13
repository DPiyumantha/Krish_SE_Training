import java.util.ArrayList;

public class Calculate {
	
	public static int getNumberOfDigits(long num) {
		int length =0;
		for(long i=10l; i<1000000000000000000l; i*=10) {
			if(num/i>=1.0) {
				length++;
			}else {
				length++;
				//System.out.println("breaking");
				break;
			}
		}
//		System.out.println(length);
		return length;
				
	}
	
	public static ArrayList<Integer> getSeperateDigits(double num, int length){
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for(int i=length-1; i>=0; i--) {
			//to separate a digit
			int digit = (int) (num/(Math.pow(10, i)));
			digits.add(digit);
//			System.out.println(digit);
			//rest of the digits as a new number
			num = num%(Math.pow(10, i));
		}
		
//		digits.forEach((n)->{
//			System.out.println(n);
//		});
//		
		return digits;
	}
	
	public static long getPow(int n, int i) {
		long res = (long)n;
		if(i==0)return 1;
		for(int j=1; j<i;j++) {
			res=res*n;
		}
		return res;
	}
	

}
