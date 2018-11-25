//MyAddress.java
//Joseph Charles Serrano
// Chapter 9, Assignment 3, Section 4
// 11/8/15
// Exercise 9.4 #8 Create a java program that displays my address and name when I click the JButton object

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
public class MyAddress extends JFrame
{
	private JFrame mainFrame;
	private JButton mainButton;
	
	public MyAddress()
	{
		mainFrame = new JFrame("Address Program");
		mainButton = new JButton("Name and Address");
		
		Container c = mainFrame.getContentPane();
		
		c.add(mainButton);
		
		mainButton.setToolTipText("This will find my adress");
		mainButton.setMnemonic('N');
		
		mainFrame.setSize(300, 150);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {System.exit(0);}
			});
		
		ButEventHandler bhandler = new ButEventHandler();
		mainButton.addActionListener(bhandler);
		
		mainFrame.setVisible(true);
	}
	
	class ButEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Joseph Charles Serrano, 752 Painter Ct. Gilroy, California 95020"
			, "My Address",JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Joseph Charles Serrano, 752 Painter Ct. Gilroy, California 95020");
		}
	}
	
	public static void main(String[] args)
	{
		new MyAddress();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac MyAddress.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java MyAddress
//Joseph Charles Serrano, 752 Painter Ct. Gilroy, California 95020