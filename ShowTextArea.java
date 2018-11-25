//ShowTextArea.java
//Joseph Charles Serrano
// 11/14/15
//Chapter 10, Section 2, Assignment 2
//Exercise 9 pg.544 Compile and Run Program 10.4

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import java.text.*;

public class ShowTextArea extends JFrame
{
	private JFrame mainFrame;
	private JTextArea outArea;
	
	public ShowTextArea()
	{
		mainFrame = new JFrame("Example of a Text Area for output");
		
		outArea = new JTextArea(10,28);
		
		Container c = mainFrame.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(outArea);
		
		mainFrame.setSize(300,250);
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		mainFrame.show();
	}
	
	public void createTable()
	{
		int num;
		DecimalFormat df = new DecimalFormat("0000");
		outArea.setFont(new Font("Courier", Font.BOLD, 10));
		outArea.append("	NUMBER        SQUARE        CUBE\n");
		outArea.append("	------        ------        ----\n");
		
		outArea.setFont(new Font("Courier", Font.PLAIN, 10));
		for (num = 1; num < 11; num++)
		{
			outArea.append("	" + df.format(num));
			outArea.append("		" + df.format(num*num));
			outArea.append("	    " + df.format(num*num*num) + '\n');
		}
		
		return;
	}
	
	public static void main(String args[])
	{
		
		ShowTextArea app;
		app = new ShowTextArea();
		
		app.createTable();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ShowTextArea.java
//Note: ShowTextArea.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java ShowTextArea
