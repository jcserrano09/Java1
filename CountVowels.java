//CountVowels.java
//Joseph Charles Serranno
//Chapter 7, Section 2, Assignment 1
// 10/25/15
//Exercise 7.2 pg.384 #5 QuickTest Program 7.3

import java.io.*;
public class CountVowels
{
	public static void main(String[] args)
	{
		String str = new String("Counting the number of vowels");
		int i, numChars;
		int vowelCount = 0;
		
		System.out.println("The string: " + str);
		
		numChars = str.length();
		for (i = 0; i < numChars; i ++)
		{
			switch(str.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				  vowelCount++;
			}
		}
		
		System.out.println("has " + vowelCount + " vowels.");
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac CountVowels.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java CountVowels
//The string: Counting the number of vowels
//has 9 vowels.