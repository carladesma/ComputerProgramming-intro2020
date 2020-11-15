package cpWeek2Ex6;

public class mainWeek2Ex6 {

	public static void main(String[] args) {
		// Given coordinates for A, B, C, and D.
		double ax = -5.5;
		double ay = 2;
		double bx = -3; 
		double by = -2.2; 
		double cx = 1; 
		double cy = 2;
		double dx = 7; 
		double dy = 4.6;

		// formula to calculate distance from A to B
		double ab = Math.sqrt(Math.pow((bx-ax), 2) + Math.pow((by-ay), 2));

		System.out.println("Distance from A to B: " + ab);

		// formula to calculate distance from B to C
		double bc = Math.sqrt(Math.pow((cx-bx), 2) + Math.pow((cy-by), 2));

		System.out.println("Distance from B to C: " + bc);
		
		// formula to calculate distance from C to D
		double cd = Math.sqrt(Math.pow((dx-cx), 2) + Math.pow((dy-cy), 2));
		
		System.out.println("Distance from C to D: " + cd);
	}

}
