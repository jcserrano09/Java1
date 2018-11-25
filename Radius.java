//Radius.java
//Chapter 4, Section 1, Assignment 2
//Name: Joseph Charles Serrano
// 10/4/15
//Exercise 4.1 #5 pg. 193

import java.io.*;
import java.util.*;
public class Radius
{
	public static void main(String[] args)
	throws java.io.IOException	
    {
	String s1;
	//num1 is going to be defined in scanner class
	double area;
	
	//adding scanner class
	//InputStreamReader isr = new InputStreamReader(System.in);
	//BufferedReader br = new BufferedReader(isr);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the radius of a circle ");
	//s1 = br.readLine();
	//num1 = Double.parseDouble(s1);
	double num1 = sc.nextDouble();
	
	area = 3.1416 * (num1 * num1);
	System.out.println("The area is " + area);
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Radius.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 1
//The area is 3.1416

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 1.5
//The area is 7.0686

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 2
//The area is 12.5664

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 2.5
//The area is 19.634999999999998

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 3
//The area is 28.2744

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Radius
//Enter the radius of a circle 3.5
//The area is 38.4846