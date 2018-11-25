//SearchSort.java
//Joseph Charles Serrano
//Chapter 8, Section 3-4, Assignment 3
// 11/1/2015
//Exercise 8.3 #1 QuickTest Program 8.9

import java.io.*;
import java.util.Arrays;
public class SearchSort
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		String s1;
		int i, numels;
		int variousNums[];
		int item, location;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number of array values: ");
		s1 = br.readLine();
		numels = Integer.parseInt(s1);
		
		variousNums = new int[numels];
		for (i = 0; i < numels; i++)
		{
			System.out.print("Enter Element " + (i+1) + ": ");
			s1 = br.readLine();
			variousNums[i] = Integer.parseInt(s1);
		}
		
		Arrays.sort(variousNums);
		
		System.out.print("The values in sorted order are: ");
		for (i = 0; i < numels; i++)
			System.out.print("	" + variousNums[i]);
		
		System.out.print("\n\nEnter the item you are researching for: ");
		s1 = br.readLine();
		item = Integer.parseInt(s1);
		
		location = Arrays.binarySearch(variousNums, item);
		
		if (location >= 0)
			System.out.println("This item is at location " + (location + 1) + " in the sorted array.");
		else
			System.out.println("This item is not in the list");
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac SearchSort.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java SearchSort
//Enter the number of array values: 5
//Enter Element 1: 13
//Enter Element 2: 123
//Enter Element 3: 244
//Enter Element 4: 22
//Enter Element 5: 12
//The values in sorted order are:         12      13      22      123     244

//Enter the item you are researching for: 123
//This item is at location 4 in the sorted array.

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java SearchSort
//Enter the number of array values: 2
//Enter Element 1: 111
//Enter Element 2: 123
//The values in sorted order are:         111     123

//Enter the item you are researching for: 99
//This item is not in the list