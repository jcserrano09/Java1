//HoursWorked.java
//Chapter 5, Section 2, Assignment 1
//Name: Joseph Charles Serrano
// 10/11/15
//Exercise 5.2 #8 pg. 257

import java.io.*;
public class HoursWorked
{	
	public static double CalculateSalary(double hours)
	{
		double salary;
		if(hours <= 40)
		{
			salary = hours * 8.0;
		}
		else
		{
			salary = 320 + (12 * (hours - 40));
		}

		return salary;		
	}
	
	public static void main(String[] args)
	throws java.io.IOException
	{
		System.out.print("Enter hours worked this week: ");
		double hours = ID.readDouble();
		double salary = CalculateSalary(hours);
		System.out.println("The salary is " + salary);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ID.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac HoursWorked.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java HoursWorked
//Enter hours worked this week: 40
//The salary is 320.0

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java HoursWorked
//Enter hours worked this week: 30
//The salary is 240.0

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java HoursWorked
//Enter hours worked this week: 50
//The salary is 440.0

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java HoursWorked
//Enter hours worked this week: a
//The value you entered is not valid.
//Please enter only number digits.
//Enter a double value: 40
//The salary is 320.0
