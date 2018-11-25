//MultiplyNumbers.java
//Chapter 4, Section 1, Assignment 1
//Name: Joseph Charles Serrano
// 10/4/15
//QuickTest Program 4.1 pg. 184

import java.io.*;
public class MultiplyNumbers
{
	public static void main(String[] args)
	throws java.io.IOException
	//I added an s3 and s4
	{
		String s1;
		String s2;
		String s3;
		String s4;
		//num3 and num4 are added; sum and another product is also added
		double num1, num2, num3, num4, sum, product1, product2;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter a number: ");
		s1 = br.readLine();
		num1 = Double.parseDouble(s1);
		
		System.out.print("Great, now enter another number: ");
		s2 = br.readLine();
		num2 = Double.parseDouble(s2);
		
		product1 = num1 * num2;
		System.out.println(num1 + " times " + num2 + " is " + product1);
		
		//The second product
		System.out.print("Enter a number: ");
		s3 = br.readLine();
		num3 = Double.parseDouble(s3);
		
		System.out.print("Great, now enter another number: ");
		s4 = br.readLine();
		num4 = Double.parseDouble(s4);
		
		product2 = num3 * num4;
		System.out.println(num3 + " times " + num4 + " is " + product2);
		
		//equation for sum
		sum = product1 + product2;
		
		System.out.println("The sum of " + product1 + " and " + product2 + " is " + sum);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac MultiplyNumbers.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java MultiplyNumbers
//Enter a number: 1
//Great, now enter another number: 3
//1.0 times 3.0 is 3.0

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac MultiplyNumbers.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java MultiplyNumbers
//Enter a number: 3
//Great, now enter another number: 4
//3.0 times 4.0 is 12.0
//Enter a number: 5
//Great, now enter another number: 6
//5.0 times 6.0 is 30.0
//The sum of 12.0 and 30.0 is 42.0
