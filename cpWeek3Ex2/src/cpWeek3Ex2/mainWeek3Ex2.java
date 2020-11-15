package cpWeek3Ex2;

import java.util.Scanner;

public class mainWeek3Ex2 {

	public static void main(String[] args) {
		//Write a program that asks the user to enter x and y coordinates of three points (A,B,C). 
		// initiate Scanner
		Scanner in = new Scanner(System.in);

		// X and Y coordinates of points A, B, and C
		System.out.println("Enter x value for A: ");
		double ax = in.nextDouble();

		System.out.println("Enter y value for A: ");
		double ay = in.nextDouble();

		System.out.println("Enter x value for B: ");
		double bx = in.nextDouble();

		System.out.println("Enter y value for B: ");
		double by = in.nextDouble();

		System.out.println("Enter x value for C: ");
		double cx = in.nextDouble();

		System.out.println("Enter y value for C: ");
		double cy = in.nextDouble();

		// calculate the sides using formula to calculate distance between two points

		double cSide = Math.sqrt(Math.pow((bx-ax), 2) + Math.pow((by-ay), 2));
		double aSide = Math.sqrt(Math.pow((cx-bx), 2) + Math.pow((cy-by), 2));
		double bSide = Math.sqrt(Math.pow((ax-cx), 2) + Math.pow((ay-cy), 2));

		// calculate the angle for point B (between aSide and cSide)
		double cosB = (Math.pow(cSide, 2) + Math.pow(aSide, 2) - Math.pow(bSide, 2)) / (2 * cSide * aSide);
		double radianB = Math.acos(cosB);

		double degreesB = radianB * (180 / Math.PI);

		System.out.println("The angle for point B is: " + degreesB);

	}

}
