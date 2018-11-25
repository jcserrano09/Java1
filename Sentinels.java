//Sentinels.java
//Chapter 6, Section 3, Assignment 2
//Name: Joseph Charles Serrano
// 10/18/15
//Exercise 6.3 #8 Modify Program 6.8 to average the grade pg.319

import javax.swing.*;
public class Sentinels
{
	public static void main(String[] args)
	{
		//total is from the oringal program
		final double HIGHGRADE = 100.0;
		String s1, outMessage;
		double grade, average, total, count;
		
		grade = 0;
		total = 0;
		average = 0;
		count = 0;
		
		outMessage = "To stop entering grades, type in any number"
				   + "\n greater than 100.";
		JOptionPane.showMessageDialog(null, outMessage, "QuickTest Program 6.8", JOptionPane.INFORMATION_MESSAGE);
		
		s1 = JOptionPane.showInputDialog("Enter a grade:");
		grade = Double.parseDouble(s1);
		
		while (grade <= HIGHGRADE)
		{
			total = total + grade;
			count = count + 1.0;
			s1 = JOptionPane.showInputDialog("Enter a Grade:");
			grade = Double.parseDouble(s1);
		}
		average = total / count;
		JOptionPane.showMessageDialog(null, "The average of the grades is " + average, "QuickTest Program 6.8", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Sentinels.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Sentinels

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>