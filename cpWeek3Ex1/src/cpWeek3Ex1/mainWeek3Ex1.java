package cpWeek3Ex1;

import java.util.Scanner;

public class mainWeek3Ex1 {

	public static void main(String[] args) {
		
		// create Scanner object
		Scanner in = new Scanner(System.in); 
		
		// prompt user to enter diameter and height of a cone
		// ask for the diameter
		System.out.println("Please enter the diameter of the cone: ");
		double diameter = in.nextDouble();
		double radius = diameter / 2.0;
		
		// ask for the height
		System.out.println("Please enter the height of the cone: ");
		// read an integer
		double height = in.nextDouble();
		
		// calculate volume of the cone and print
		double volume = Math.PI*Math.pow(radius, 2.0)*(height/3.0);
		
		System.out.println("Volume of the cone: " + volume);
		
		// calculate total surface area of the cone and print
		double totalsurface = Math.PI * radius * ( radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow( radius, 2.0)));
		
		System.out.println("Total surface area of the cone: " + totalsurface);

	}

}
