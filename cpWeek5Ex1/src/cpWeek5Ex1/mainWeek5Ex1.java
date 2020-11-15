package cpWeek5Ex1;

import java.util.Random;
import java.util.Scanner;

public class mainWeek5Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		int low = 1;
		int high = 100;
		int result = r.nextInt(high-low) + low;
		
		//System.out.println(result);
		// initate 10 loop
		int numberOfGuesses = 1;
		
		while(numberOfGuesses <= 11) {
			System.out.println("Please input a number between 1-100: ");
			int guess = in.nextInt();
			
			if(guess < 101 && guess > 0) {
				if(guess < result) {
					System.out.println("Guess is lower than number.");
				}
					else if(guess > result) {
						System.out.println("Guess is higher than number");
					}
					
						else if(guess == result) {
							System.out.println("Guess is equal to number.");
						}
			}
			
			else {
				System.out.println("Invalid number. Please enter values between 1-100.");
			}
			
			numberOfGuesses ++;
		}
		
		System.out.println("You are out of turns.");
	}

}
