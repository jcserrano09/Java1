//SampleInputDialog.java
//Chapter 4, Section 2, Assignment 3
//Name: Joseph Charles Serrano
// 10/4/15
//Quicktest Program 4.3 pg.196
import javax.swing.*;
public class SampleInputDialog
{
	public static void main(String[] args)
	{
		//I added s3, s4, sum, and another average
		String s1, s2, s3, s4;
		double num1, num2, num3, num4, sum, average1, average2;
		
		s1 = JOptionPane.showInputDialog("Enter a number: ");
		s2 = JOptionPane.showInputDialog("Great, now enter another number: ");
		
		num1 = Double.parseDouble(s1);
		num2 = Double.parseDouble(s2);
		average1 = (num1 + num2)/2.0;
		
		JOptionPane.showMessageDialog(null,
		"The average of " + num1 + " and " + num2 + " is " + average1, "Quicktest Program 4.3", JOptionPane.INFORMATION_MESSAGE);
		
		// The average of the 3rd and 4th number
		s3 = JOptionPane.showInputDialog("Enter a number: ");
		s4 = JOptionPane.showInputDialog("Great, now enter another number: ");
		
		num3 = Double.parseDouble(s3);
		num4 = Double.parseDouble(s4);
		average2 = (num3 + num4)/2.0;
		
		JOptionPane.showMessageDialog(null,
		"The average of " + num3 + " and " + num4 + " is " + average2, "Quicktest Program 4.3", JOptionPane.INFORMATION_MESSAGE);
		
		//The sum
		sum = (average1 + average2);
		JOptionPane.showMessageDialog(null,
		"The sum of " + average1 + " and " + average2 + " is " + sum, "Quicktest Program 4.3", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		System.exit(0);
		
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac SampleInputDialog.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java SampleInputDialog

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac SampleInputDialog.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java SampleInputDialog
