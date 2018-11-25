//FirstGui.java
//Joseph Charles Serrano
// Chapter 9, Assignment 1, Section 2
// 11/8/15
// Program 9.1

import javax.swing.*;
import java.awt.Color;
public class FirstGui
{
	public static void main(String[] args)
	{
		JFrame mainFrame;
		mainFrame = new JFrame("First GUI Window");
		
		mainFrame.setSize(300,150);
		mainFrame.setVisible(true);
		
		// I added a background color 
		mainFrame.getContentPane().setBackground(Color.RED);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac FirstGui.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java FirstGui