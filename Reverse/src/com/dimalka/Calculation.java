package com.dimalka;
import java.util.ArrayList;

public class Calculation {
	
	public static int getNumberOfDigits(long num) {
		int length =0;
		//===============================================
		//this limit of long number(1000000000000000000L) 
		//is the reason why this program supports
		//only up to 999999999999999
		//===============================================
		for(long i=10l; i<1000000000000000000L; i*=10) {
			if(num/i>=1.0) {
				length++;
			}else {
				length++;
				break;
			}
		}
		return length;
				
	}
	
	public static ArrayList<Integer> getSeperateDigits(double num, int length){
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for(int i=length-1; i>=0; i--) {
			//to separate a digit
			int digit = (int) (num/(Math.pow(10, i)));
			digits.add(digit);
			//set the rest of the digits as a new number
			num = num%(Math.pow(10, i));
		}
		return digits;
	}
	
	//didn't use Math.pow because some malfunctions occurred and i thought that's because Math.pow uses double args 
	//when i created this method, all were good
	public static long getPow(int n, int i) {
		long res = (long)n;
		if(i==0)return 1;
		for(int j=1; j<i;j++) {
			res=res*n;
		}
		return res;
	}
	

}
