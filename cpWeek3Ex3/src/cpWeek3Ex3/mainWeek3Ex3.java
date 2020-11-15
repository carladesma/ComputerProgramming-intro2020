package cpWeek3Ex3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class mainWeek3Ex3 {

	public static void main(String[] args) {

		
		DecimalFormat df = new DecimalFormat("00");
		
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		long totalMil = System.currentTimeMillis();
		long currentMil = (long)totalMil%1000;
		long totalSec = totalMil/1000;
		int currentSec = (int)totalSec%60;
		long totalMinutes = totalSec/60;
		int currentMinute = (int)totalMinutes%60;
		long totalHours = totalMinutes/60;
		int currentHour = (int)totalHours%24;
		
		String paddedMil = String.format("%04d", currentMil);
		
		System.out.println(df.format(currentHour) + ":" + df.format(currentMinute) + ":" + df.format(currentSec) + ":" + paddedMil);
		
	}

}
