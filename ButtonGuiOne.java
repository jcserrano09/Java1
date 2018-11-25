//ButtonGuiOne.java
//Joseph Charles Serrano
// Chapter 9, Assignment 4, Section 4
// 11/8/15
// Exercise 9.4 #2 Program 9.7

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
public class ButtonGuiOne extends JFrame
{
	private JFrame mainFrame;
	private JButton firstButton;
	
	public ButtonGuiOne()
	{
		mainFrame = new JFrame("Example of a Gui with a Button");
		
		firstButton = new JButton("Press me");
		
		Container c = mainFrame.getContentPane();
		
		c.add(firstButton);
		
		mainFrame.setSize(300,150);
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ButtonGuiOne();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ButtonGuiOne.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java ButtonGuiOne