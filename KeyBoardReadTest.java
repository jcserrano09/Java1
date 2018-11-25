//KeyBoardReadTest.java
//Chapter 4, Section 3 & 4, Assignment 5
//Name: Joseph Charles Serrano
// 10/4/15
//Program 4.6 pg.208
import java.util.*;
public class KeyBoardReadTest
{

	public static void main(String[] args)
	throws java.io.IOException, java.text.ParseException
	{
		int num1;
		double num4;
		String dt;
		
		System.out.print("Enter an integer value: ");
		num1 = ID.readInt();
		System.out.println("The integer entered is " + num1);
		
		System.out.print("Enter a double value: ");
		num4 = ID.readDouble();
		System.out.println("The double value entered is " + num4);
		
		System.out.print("Enter a Date value: ");
		dt = ID.readDate();
		System.out.println("The Date value entered is " + dt);
		
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ID.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac KeyBoardReadTest.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java KeyBoardReadTest
//Enter an integer value: 5
//The integer entered is 5
//Enter a double value: 6.0
//The double value entered is 6.0

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ID.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac KeyBoardReadTest.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java KeyBoardReadTest
//Enter an integer value: 5
//The integer entered is 5
//Enter a double value: 5.5
//The double value entered is 5.5
//Enter a Date value: 10/4/2015
//The Date value entered is 10/04/2015