//OfficeArea.java
//Chapter 4, Section 2, Assignment 4
//Name: Joseph Charles Serrano
// 10/4/15
//Exercise 4.2 #6 pg. 205

import javax.swing.*;
public class OfficeArea
{
	public static void main(String[] args)
	{
		String s1, s2;
		double num1, num2, area;
		
		s1 = JOptionPane.showInputDialog("Enter the length of the office: ");
		s2 = JOptionPane.showInputDialog("Enter the width of the office: ");
		
		num1 = Double.parseDouble(s1);
		num2 = Double.parseDouble(s2);
		
		area = num1 * num2;
		
		JOptionPane.showMessageDialog(null,
		"The length " + num1 + " times the width " + num2 + " is " + area, "Quicktest Program 4.3", JOptionPane.INFORMATION_MESSAGE);
		
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac OfficeArea.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java OfficeArea

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>
