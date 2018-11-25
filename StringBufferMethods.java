//StringBufferMethods.java
//Joseph Charles Serranno
//Chapter 7, Section 3, Assignment 2
// 10/25/15
//Exercise 7.3 pg.392 #1 QuickTest Program 7.6

import java.io.*;
public class StringBufferMethods
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("This cannot be ");
		int i, numChars;
		
		System.out.println("The original string is: " + str);
		
		numChars = str.length();
		System.out.println(" This string has " + numChars + " characters.");
		
		str.insert(4, " I know");
		System.out.println("The string, after insertion, is now: " + str);
		numChars = str.length();
		System.out.println(" This string has " + numChars + " characters.");
		
		str.replace(12, 18, "to");
		System.out.println("The string, after replacement, is now: " + str);
		numChars = str.length();
		System.out.println(" This string has " + numChars + " characters.");
		
		str.append(" correct");
		System.out.println("The string, after appending, is now: " + str);
		numChars = str.length();
		System.out.println(" This string has " + numChars + " characters.");
		
		str.reverse();
		System.out.println("The string, after being reversed, is: " + str);
		
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac StringBufferMethods.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java StringBufferMethods
//The original string is: This cannot be
// This string has 15 characters.
//The string, after insertion, is now: This I know cannot be
// This string has 22 characters.
//The string, after replacement, is now: This I know to be
// This string has 18 characters.
//The string, after appending, is now: This I know to be  correct
// This string has 26 characters.
//The string, after being reversed, is: tcerroc  eb ot wonk I sihT
