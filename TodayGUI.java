//TodayGUI.java
//Joseph Charles Serrano
// 11/14/15
//Chapter 10, Section 1, Assignment 1
//Exercise 6 pg.528 Create a GUI with 2 buttons

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class TodayGUI extends JFrame
{
	private JFrame mainFrame;
	private JButton cmdGood;
	private JButton cmdBad;
	private JButton ExitButton;
	
	class cmdGoodHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Today is a good day!",
			"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	class cmdBadHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "I'm havng a bad day today!",
			"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public TodayGUI()
	{
		mainFrame = new JFrame("Messages");
		
		cmdGood = new JButton("Good");
		cmdBad = new JButton("Bad");
		ExitButton = new JButton("Exit");
		
		Container c = mainFrame.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(cmdGood);
		c.add(cmdBad);
		c.add(ExitButton);
		
		cmdGood.setMnemonic('G');
		cmdBad.setMnemonic('B');
		ExitButton.setMnemonic('X');
		
		mainFrame.setSize(300,100);
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		cmdGoodHandler ghandler = new cmdGoodHandler();
	cmdGood.addActionListener(ghandler);
	
	cmdBadHandler bhandler = new cmdBadHandler();
	cmdBad.addActionListener(bhandler);
	
	ExitButtonHandler ehandler = new ExitButtonHandler();
	ExitButton.addActionListener(ehandler);
		
		mainFrame.show();
	}
	public static void main(String args[])
	{
		TodayGUI app;
		app = new TodayGUI();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac TodayGUI.java
//Note: TodayGUI.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java TodayGUI

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>
