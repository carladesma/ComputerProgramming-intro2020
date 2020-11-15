package cpWeek2Ex4;

public class mainWeek2Ex4 {
	
	public static void main(String[] args) {
		// state how many numbers of days in a year and leap year
		double daysinyear = 365;
		double daysinleapyear = 366;
		
		// calculate total number of days for 21st century
		double totalnumberofdays = (daysinyear * 75) + (daysinleapyear * 25);
		
		System.out.println("There are " + totalnumberofdays + " days" + " in the 21st Century.");
	}
}
