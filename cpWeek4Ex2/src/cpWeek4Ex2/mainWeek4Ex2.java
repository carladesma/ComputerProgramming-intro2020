package cpWeek4Ex2;

import java.util.Scanner;

public class mainWeek4Ex2 {

	public static void main(String[] args) {

		// initiate scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = in.nextInt();
		System.out.println("Enter month: ");
		int month = in.nextInt();
		System.out.println("Enter day: ");
		int day = in.nextInt();

		

		boolean longmonths = month == 1|| month == 3|| month == 5|| month ==7|| month == 8|| month == 10|| month == 12;
		boolean shortmonths = month == 4|| month == 6|| month == 9|| month == 11;
		boolean february = month == 2;
		boolean leapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);

		
		if (year > 0) {
			System.out.println("Year is valid.");
			if (month > 0 && month <= 12) {
				System.out.println("Month is valid.");

				if(longmonths) {
					if(day > 0 && day <= 31) {
						System.out.println("Day is valid.");
					}
					else {
						System.out.println("Day is invalid.");
					}
				}

				else if(shortmonths) {
					if(day > 0 && day <=30) {
						System.out.println("Day is valid.");
					}
					else {
						System.out.println("Day is invalid.");
					}
				}

				else if(february) {
					if(day > 0 && day <= 28) {
						System.out.println("Day is valid.");
					}
					else if (leapYear) {
						if(day > 0 && day <= 29) {
							System.out.println("Day is valid.");
						}
					}
					else {
						System.out.println("Day is invalid.");
					}
				}
			}
		}

		else {
			System.out.println("Year is invalid.");
		}

	}

}
