package com.dimalka;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Application {

	public static void main(String[] args) {
		long input=0L;
		try {
			input = View.getInput();
		}catch(InputMismatchException inputMismatchException) {
			System.out.println(inputMismatchException);
			System.err.println("Input value exceeded 999999999999999");
			input = View.getInput();
		}
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int length = 0;
		long reversedNumber = 0l;
		int[] digitsArray;
		if (input <= 999999999999999L) {
			// calculating the number of digits
			length = Calculation.getNumberOfDigits(input);
			// separating the digits mathematically
			digits = Calculation.getSeperateDigits(input, length);
			digitsArray = new int[length];
			// reversing the digits array
			for (int i = length - 1; i >= 0; i--) {
				digitsArray[length - 1 - i] = digits.get(length - 1 - i);
			}
			// multiply the digits by multiples of 10 and add, so that they are placed
			// accordingly
			for (int i = length - 1; i >= 0; i--) {
				reversedNumber += (long) digitsArray[i] * Calculation.getPow(10, i);
			}
			// type is used as long to support lengthy numbers

			View.printResult(input, reversedNumber);
		} else {
			System.err.println("Input value exceeded 999999999999999");
		}

	}

}
