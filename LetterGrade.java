//LetterGrade.java
//Chapter 5, Section 3, Assignment 2
//Name: Joseph Charles Serrano
// 10/11/15
//Exercise 5.3 #1 pg.263

import java.io.*;
public class LetterGrade
{
	public static String ShowLetterGrade(double grade)
	{
		String LetterGrade = "";
		
		if(grade >= 90)
			LetterGrade = "A";
		else if(grade < 90 & grade >= 80)
			LetterGrade = "B";
		else if(grade < 80 & grade >= 70)
			LetterGrade = "C";
		else if(grade < 70 & grade >= 60)
			LetterGrade = "D";	
		else if(grade < 60)
			LetterGrade = "F";
		
		return LetterGrade;
	}
	
	public static void main(String[] args)
	throws java.io.IOException
	{
		System.out.print("Enter a numerical grade: ");
		double grade = ID.readDouble();
		String LetterGrade = ShowLetterGrade(grade);
		System.out.println("Your grade is " + LetterGrade);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac LetterGrade.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java LetterGrade
//Enter a numerical grade: 50
//Your grade is F

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java LetterGrade
//Enter a numerical grade: 100
//Your grade is A

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java LetterGrade
//Enter a numerical grade: a
//The value you entered is not valid.
//Please enter only number digits.
//Enter a double value: 80
//Your grade is B