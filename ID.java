//ID.java
//Chapter 4, Section 3 & 4, Assignment 5
//Name: Joseph Charles Serrano
// 10/4/15         								 *I MAY USE THIS PROGRAM IN FUTURE ASSIGNMENTS
//program 4.7 pg.209
//Apart of program 4.6 to add ID class 

import java.io.*;
//added java.util for Date
import java.util.*;
//added java.text for SimpleDateFormat
import java.text.*;

public class ID
{
	public static String readData()
	throws java.io.IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		return br.readLine();
	}
	
	public static int readInt()
	throws java.io.IOException
	{		
		int inValue = 0;
		boolean validNumber = false;
		String inString = null;
		
		while(!validNumber)
		{
			try
			{
				inString = readData();
				inValue = Integer.parseInt(inString.trim());
				validNumber = true;
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("The value you entered is not valid. ");
				System.out.println("Please enter only number digits. ");
				System.out.print("Enter an integer value: ");
			}
		}
		// changed for other programs
		//System.out.println("Returning value");
		return inValue;
	}
			
	public static double readDouble()
	throws java.io.IOException
	{
		double inValue = 0;
		boolean validNumber = false;
		String inString = null;
				
		while(!validNumber)
		{
			try
			{
				inString = readData();
				inValue = Double.parseDouble(inString.trim());
				validNumber = true;
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("The value you entered is not valid. ");
				System.out.println("Please enter only number digits. ");
				System.out.print("Enter a double value: ");
			}
		}
		// changed for other programs
		//System.out.println("Returning value");
		return inValue;	
	}
	
	
	//I added readDate
	public static String readDate()
	throws java.io.IOException
	{
		String inValue = null;
		boolean validDate = false;
		String inString = null;
				
		while(!validDate)
		{
			try
			{
				inString = readData();
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
				Date dateStr = formatter.parse(inString);
				inValue = formatter.format(dateStr);				
				validDate = true;
				
			}
			catch(ParseException e)
			{
				System.out.println(" The value you entered is not valid. ");
				System.out.println(" Please enter only date in MM/dd/yyyy format. ");
				System.out.print("Enter a Date value: ");
			}
		}
		//changed for other programs
		//System.out.println("Returning value");
		return inValue;	
	}
}