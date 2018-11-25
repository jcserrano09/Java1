//StringMethods.java
//Joseph Charles Serranno
//Chapter 7, Section 2, Assignment 1
// 10/25/15
//Exercise 7.2 pg.383 #1 QuickTest Program 7.2

import java.io.*;

public class StringMethods
{
	public static void main(String[] args)
	{
		String string1 = new String("Hello");
		String string2 = new String("Hello There");
		int n;
		
		System.out.println("string1 is the string " + string1);
		System.out.println("string2 is the string " + string2);
		
		n = string1.compareTo(string2);
		
		if(n < 0)
			System.out.println(string1 + " is less than " + string2);
		else if (n == 0)
			System.out.println(string1 + " is equal to " + string2);
		else
			System.out.println(string1 + " is greater than " + string2);
		
		if(string1.equalsIgnoreCase("HELLO"))
			System.out.println("string1 equals (ignoring case) HELLO");
		else
			System.out.println("string1 does not equal (ignoring case) HELLO");
		
		System.out.println("\nThe number of characters in the string1 is " + string1.length());
		System.out.println("The number of characters in string2 is " + string2.length());
		
		string1 = string1.concat(" there world!");
		System.out.println("\nAfter concatenation, string1 contains the characters " + string1);
		System.out.println("The length of this string is " + string1.length());
		
		string1 = string1.toLowerCase();
		System.out.println("\nIn lowercase this string is " + string1);
		
		string1 = string1.toUpperCase();
		System.out.println("\nIn uppercase this string is " + string1);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac StringMethods.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java StringMethods
//string1 is the string Hello
//string2 is the string Hello There
//Hello is less than Hello There
//string1 equals (ignoring case) HELLO

//The number of characters in the string1 is 5
//The number of characters in string2 is 11

//After concatenation, string1 contains the characters Hello there world!
//The length of this string is 18

//In lowercase this string is hello there world!

//In uppercase this string is HELLO THERE WORLD!

