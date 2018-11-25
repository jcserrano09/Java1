//EnterGrades.java
//Chapter 6, Section 5, Assignment 4
//Name: Joseph Charles Serrano
// 10/18/15
//Exercie 6.5 pg.336 #2

import java.io.*;

public class EnterGrades
{
	public static String readData()
	throws java.io.IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		return br.readLine();
	}

	public static void main(String[] args)
	throws java.io.IOException
	{
		final double HighGrade = 100;
		String s1, Message;
		double grade, average, total, count;
		
		grade = 0;
		average = 0;
		total = 0;
		count = 0;
		
		System.out.println("Type in a grade that is between 0 to 100" + 
									"\n Enter the number 999 to stop.");
		
		do
		{
			System.out.print("Enter a grade:");
			s1 = readData(); 
			grade = Double.parseDouble(s1);	
			if (grade < 0 || grade > 100)
			{
				System.out.println("Grade is invalid.");
			}
			else 
			{
				total = total + grade;			
				count = count + 1;				
			}
		}
		while(grade != 999);
		
		average = total / count;
		
		System.out.print("The average of the grades is " + average);
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac EnterGrades.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java EnterGrades
//Type in a grade that is between 0 to 100
// Enter the number 999 to stop.
//Enter a grade:2
//Enter a grade:5
//Enter a grade:7
//Enter a grade:101
//Grade is invalid.
//Enter a grade:-3
//Grade is invalid.
//Enter a grade:10
//Enter a grade:999
//Grade is invalid.
//The average of the grades is 6.0
