package cpWeek4Ex1;

import java.util.Scanner;

public class mainWeek4Ex1 {

	public static void main(String[] args) {
		// scanner line
		Scanner in = new Scanner(System.in);

		// user prompt
		System.out.println("Please enter a letter from the alphabet:");

		// conversion: user input into char 
		char userinput = in.next().charAt(0);

		// conversion: char into ASCII
		int letterinput = (int) userinput;


		if((letterinput >= 67 && letterinput <= 90) || (letterinput >= 97 && letterinput <= 122))
			switch(letterinput) {
			case(65):
			case(69):
			case(73):
			case(79):
			case(85):
			case(97):
			case(101):
			case(105):
			case(111):
			case(117):
				// print if userinput is vowel
				System.out.println(userinput + " is a vowel.");
			break;
			default:
				// print if userinput is a consonant
				System.out.println(userinput + " is a consonant.");
				break;
			}

		else {
			System.out.println("Invalid character. Please enter a letter from the alphabeth.");
		}


	}

}
