//DisplayADialog.java
//Chapter 1, Section 5, Assignment 3
//Name: Joseph Charles Serrano
// 9/13/15
// Sample program that prints "Hello World" in a dialog box(QuickTest Program 1.4)
//page 38


import javax.swing.*;
public class DisplayADialog
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Hello World!",
		"Sample" ,JOptionPane.WARNING_MESSAGE);
		//I've added another dialog box with a different header and text
		JOptionPane.showMessageDialog(null, "Java is fun to learn!",
		"Another Text Box" ,JOptionPane.WARNING_MESSAGE);
		System.exit(0);
	}
}