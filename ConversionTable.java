//ConverionTable.java
//Chapter 6, Section 2, Assignment 1
//Name: Joseph Charles Serrano
// 10/18/15
//Exercise 6.2 #2 Rewrite Program 6.4 pg.307

import java.text.*;
public class ConversionTable
{
	public static void main(String[] args)
	{
		//original
		//final int MAXCELSIUS = 50;
		//final int STARTVAL = 5;
		//final int STEPSIZE = 5;
		final int MAXCELSIUS = 60;
		final int STARTVAL = -10;
		final int STEPSIZE = 10;
		int celsius;
		double fahren;
		
		DecimalFormat cf = new DecimalFormat("00");
		DecimalFormat ff = new DecimalFormat("000");

		System.out.println("DEGREES	DEGREES\n"
						+"CELCIUS	FAHRENHEIT\n"
						+"-------	-----------");
		
		celsius = STARTVAL;
		while (celsius <= MAXCELSIUS)
		{
			fahren = (9.0/5.0) * celsius + 32.0;
			System.out.print("	" + cf.format(celsius));
			System.out.println("	" + ff.format(fahren));
			celsius = celsius + STEPSIZE;
		}
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ConversionTable.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java ConversionTable
//DEGREES DEGREES
//CELCIUS FAHRENHEIT
//------- -----------
//       -10     014
//        00      032
//        10      050
//        20      068
//        30      086
//        40      104
//        50      122
//        60      140