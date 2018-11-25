//FindMaxValue.java
//Joseph Charles Serrano
//Chapter 8, Section 2, Assignment 2
// 11/1/2015
//Exercise 8.2 #5 QuickTest Program 8.6

public class FindMaxValue
{
	public static void main(String[] args)
	{
		
		int i, max;
	int nums[] = {2, 18, 1, 27, 16};
		
		max = nums[0];
		
		for (i = 1; i < nums.length; i++)
			if (max < nums[1])
				max = nums[1];
			
		System.out.println("The maximum value is " + max);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac FindMaxValue.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java FindMaxValue
//The maximum value is 18

