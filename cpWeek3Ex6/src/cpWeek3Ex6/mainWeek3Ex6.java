package cpWeek3Ex6;

import java.util.Scanner;

public class mainWeek3Ex6 {

	public static void main(String[] args) {
		// initiate the scanner
		Scanner in = new Scanner(System.in);


		// relationship status
		System.out.println("Enter a number between 1 - 3:( 1 - Single, 2 - Single with child, 3 - Married )");
		int status = in.nextInt();

		// user's monthly earning
		System.out.println("Enter monthly salary: ");
		double monthlySalary = in.nextDouble();
		double yearlySalary = monthlySalary * 12;

		// taxbands
		double singleTaxband = 35300;
		double singleWithChildTaxband = 39300;
		double marriedTaxband = 44300;


		if (status == 1) {

			if (yearlySalary <= singleTaxband) {
				double tax = 0.2;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);

			}

			else if (yearlySalary > singleTaxband) {
				double tax = 0.4;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;							// need to RE-DO this. Minus the first .2 from first tax paid before calculating for .4
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);
			}
		}

		if (status == 2) {

			if (yearlySalary <= singleWithChildTaxband) {
				double tax = 0.2;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);

			}

			else if (yearlySalary > singleWithChildTaxband) {
				double tax = 0.4;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);
			}
		}

		if (status == 3) {

			if (yearlySalary <= marriedTaxband) {
				double tax = 0.2;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);

			}

			else if (yearlySalary > marriedTaxband) {
				double tax = 0.4;
				double taxPaidYearly = yearlySalary * tax;
				double taxPaidMonthly = taxPaidYearly / 12;
				
				System.out.println("Monthly tax to be paid: " + taxPaidMonthly);
			}
		}
		
		else {
			System.out.println("Invalid status. Please choose a number between 1-3.");
		}



	}

}
