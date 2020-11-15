package cpWeek3Ex4;

import java.util.Scanner;

public class mainWeek3Ex4 {

	public static void main(String[] args) {
		// initiate the scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int input = in.nextInt();
		
	
		if (input == 0) {
			System.out.println("The number is zero.");
		}
		
		if (input > 0) {
			System.out.println("The number is positive.");
		}
		
		if (input< 0) {
			System.out.println("The number is negative.");
		}
	}

}
