package cpWeek2Ex5;

public class cpWeek2Ex5 {

	public static void main(String[] args) {
		// A. Calculate volume of cylindrical tin of soup.
		// dimensions of cylindrical tin of soup in centimeter
		double radius = 7;
		double height = 10.5;

		// formula to calculate volume of cylinder
		double volume = Math.PI*Math.pow(radius, 2)*height;

		// print volume of cylinder
		System.out.println("Volume of a cylindrical tin of soup: " + volume);

		
		
		// B. Calculate the area of a rectangular wrapper to cover the curved surface of the soup tin.
		// formula to calculate area of cylinder's curved surface
		double lateralarea = 2*Math.PI*radius*height;
		
		// print area of curved surface / lateral surface of cylinder
		System.out.println("Surface area of the side of the cylinder: " + lateralarea);
		
		
		// C. Calculate total surface area of clingfilm required to wrap the tin of soup.
		// formula to calculate total surface area of the tin
		double area = (2*Math.PI*radius*height) + (2*Math.PI*Math.pow(radius, 2));
		
		// print total surface area of cylinder
		System.out.println("Rectangular area needed to cover the curved surface of the soup tin: " + area);

	}

}
