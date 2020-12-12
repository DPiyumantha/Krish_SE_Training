import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12345678;
		double num =(double)input;
		System.out.println("User Input : "+input);
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int length =0;
		for(int i=10; i<1000000000; i*=10) {
			if(num/i>=1.0) {
				length++;
			}else {
				length++;
				//System.out.println("breaking");
				break;
			}
		}
		System.out.println("Length :"+length);
		
		for(int i=length-1; i>=0; i--) {
			int digit = (int) (num/(Math.pow(10, i)));
			digits.add(digit);
			num = num%(Math.pow(10, i));
		}
		
		int[] arr= new int[length];
		
//		System.out.println(digits.toString());
		
		
		
		for(int i=length-1; i>=0; i--) {
			arr[length-1-i]=digits.get(length-1-i);
		}
//		for(int i=0; i<length;i++) {
//			System.out.print(arr[i]);
//		}
		
		double rev=0.0;
		
		
		for(int i=length-1; i>=0;i--) {
			rev+=arr[i]*Math.pow(10, i);
		}
		int finalResult = (int)rev;
		System.out.println("Final Result :"+finalResult);
		
//		double rev = 0.0;
//		for(int i=1; i<10*length; i*=10) {
//			rev+=digits.get(i)*(i/10);
//		}
		
		

	}

}
