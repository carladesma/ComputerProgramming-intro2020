package cpWeek3Ex5;

import java.util.Scanner;

public class mainWeek3Ex5 {

	public static void main(String[] args) {
		// initiate the scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter weight in kg: ");
		float weight = in.nextFloat();
		
		System.out.println("Enter height in cm: ");
		float height = in.nextFloat()/100; // divide input (cm) by 100 to get m.
		
		//float heightm = heightcm / 100;
		
		// formula to calculate BMI
		float bmi = (float)(weight / Math.pow(height, 2));

		if (bmi < 18.5 && bmi > 0) {
			System.out.println("BMI: Underweight.");
		}
			else if (bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("BMI: Normal.");
			}
				else if (bmi >= 25 && bmi <= 29.9) {
					System.out.println("BMI: Overweight.");
				}
					else if (bmi >= 30) {
						System.out.println("BMI: Obese.");
					}

	}

}
