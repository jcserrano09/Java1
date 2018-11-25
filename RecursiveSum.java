//Chapter 6, Section 6, Assignment 5 
//Name: Joseph Charles Serrano
// 10/18/15
//Exercise 6.6 #2 pg.342

import javax.swing.*;
public class RecursiveSum
{
	public static int CalculateSum(int n)
	{
		if (n <= 1)
		{ 
			return n; 
		}
		else 
		{
			return n + CalculateSum(n - 1);
		}
	}
	
	public static void main(String[] args)
	{
		String outMessage = "Sum of a series of consecutive numbers";
		
		JOptionPane.showMessageDialog(null, outMessage, "QuickTest Program 6.8", JOptionPane.INFORMATION_MESSAGE);
		
		String s1 = JOptionPane.showInputDialog("Enter a number:");
		int n = Integer.parseInt(s1);
		
		int Sum = CalculateSum(n);

		JOptionPane.showMessageDialog(null, "The Sum of series of consecutive numbers from 1 to " + n + " is " + Sum, 
				"Exercise 6.6 #2 pg.342", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RecursiveSum

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RecursiveSum.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RecursiveSum
