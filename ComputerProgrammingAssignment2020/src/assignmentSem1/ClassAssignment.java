package assignmentSem1;

import java.util.Random;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ClassAssignment {

	public static void main(String[] args) {
		// Game should generate 10 numbers between 1 and 99. Two digit format. No repeating numbers. Calculate sum in the end.
		
		DecimalFormat df = new DecimalFormat("00"); // set format for 2 digit numbers.
		
		// Initiate random number generator. Set to generate numbers from 1-99 only.
		Random rnd = new Random();
		int min = 1, max = 99, draws = 10;
		
		// call elements in draws to be 0.
		int[] lotteryNumbersArray = new int[draws];
		boolean numberRepeated;
		int randomNumber = 0;
		
		for(int numbersDrawn = 0; numbersDrawn < draws ; numbersDrawn++) {
			do {
				numberRepeated = false;
				randomNumber = rnd.nextInt(max - min) + min; // computer counts 0-98 so this method is used to any generated numbers.
				
				// run program to check for repeated numbers
				for(int n = 0; n <= numbersDrawn; n++) {
					if(lotteryNumbersArray[n] == randomNumber) { // if any randomNumber is equal to numbersDrawn
						numberRepeated = true;
						break;
					} // end if
				} // end for
			} // end do
			
			while (numberRepeated); // matches the boolean value "false" inside the do {}.
			
			lotteryNumbersArray[numbersDrawn] = randomNumber;
			
		} // end for
		
		System.out.println("The winning lottery numbers are:");
		
		for(int i = 0; i < draws; i++) {
			System.out.printf(df.format(lotteryNumbersArray[i]) + " ");
		} // end for
	}
	

}
