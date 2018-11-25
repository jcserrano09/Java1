//Date.java
//Chapter 5, Section 6, Assignment 4
//Name: Joseph Charles Serrano
// 10/11/15
import java.text.*;

public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		month = 7;
		day  = 4;
		year = 2005;
		System.out.println("From the default constructor:"
						+ "\n Created a new Date object with date values"
						+ "\n	month = " + month + "	day = " + day
						+ "	year = " + year + '\n');	
	}
	
	public Date(int mm, int dd, int yyyy)
	{
		month = mm;
		day = dd;
		year = yyyy;
		System.out.println("From the overloaded constructor:"
						+ "\n Created a new Date object with date values"
						+ "\n	month = " + month + "	day = " + day
						+ "	year = " + year + '\n');
	}
	
	public void setDate(int mm, int dd, int yyyy)
	{
		month = mm;
		day = dd;
		year = yyyy;
	}
	
	public void showDate()
	{
		DecimalFormat df = new DecimalFormat("00");
		
		System.out.println("The date is " + df.format(month)
						+ '/' + df.format(day) + '/'
						+ df.format(year % 100));
	}
	
	public void convert()
	{
		int inDate = year * 10000 + month * 100 + day;
		System.out.println("The date in integer format is " + inDate);
	}
}