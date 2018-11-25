//CountingCharacters.java
//Joseph Charles Serranno
//Chapter 7, Section 3, Assignment 2
// 10/25/15
//Exercise 7.3 pg.392 #2 Write a progam that counts the characters in a string

import java.io.*;
public class CountingCharacters
{
	public static void main(String[] args)
	{
		String str = new String("Counting all the characters in this string");
		int i, numChars;
		int stringCount = 0;
	
		System.out.println("The string: " + str);
		
		numChars = str.length();
		for (i = 0; i < numChars; i ++)
		{
			switch(str.charAt(i))
			{
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
				case ' ':
				  stringCount++;
			}
		}
		
		System.out.println("has " + stringCount + " characters.");
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac CountingCharacters.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java CountingCharacters
//The string: Counting all the characters in this string
//has 41 characters.
