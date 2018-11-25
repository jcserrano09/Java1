//SecondWindow.java
//Joseph Charles Serrano
// Chapter 9, Assignment 2, Section 3
// 11/8/15
// Exercise 9.3 #1 Run Program 9.3 and repeat without the mainFrame.addWindowListener(handler);

import javax.swing.*;
import java.awt.event.*;
public class SecondWindow extends JFrame
{
	private JFrame mainFrame;
	
	public SecondWindow()
	{
		mainFrame = new JFrame("Second GUI window");
		
		mainFrame.setSize(300,150);
		mainFrame.show();
		
		WinHandler handler = new WinHandler();
		//removing this for exercise #1
		//mainFrame.addWindowListener(handler);
		//If this is removed, then the window would be closed, but the command prompt is still running the program.
		//It would keep running until the prompt is closed.
	}
	public static void main(String[] args)
	{
		new SecondWindow();
	}
}
class WinHandler implements WindowListener
{
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowClosed(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java SecondWindow

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>
