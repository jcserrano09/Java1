//TicTacToe.java
//Joseph Charles Serrano
//Chapter 10, Assignment 3
// 11/15/15
// Write a program that plays tic-tac-toe using a GUI and a 2D array

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JPanel
{
    static JFrame window = new JFrame();
	JButton b[][] = new JButton[3][3];
	int alternate = 0; //even number is first player - put "X"; odd number is second player - put "O";
	
	public TicTacToe()
	{
		setLayout(new GridLayout(3,3));
		initializebuttons(); 
	}
	
	public void initializebuttons()
	{		
		for (int c = 0; c <= 2; c++)
		{
			for (int r = 0; r <= 2; r++)
			{
				b[c][r] = new JButton();
				b[c][r].setText("");
				b[c][r].addActionListener(new buttonListener());
				add(b[c][r]);  //adds this button to JPanel.  This whole class is an extension of JPanel
			}
		}
	}
	
	public void resetButtons()
	{
		for (int c = 0; c <= 2; c++)
		{
			for (int r = 0; r <= 2; r++)
			{
				b[c][r].setText("");
			}
		}
	}
	
	private class buttonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			JButton buttonClicked = (JButton)e.getSource();
			
			if (buttonClicked.getText() == "")
			{
				boolean isFirstPlayer = false;
				
				if (alternate % 2  == 0) //alternate is divisble by 2 that means it's even number
				{
					buttonClicked.setText("X");
					window.setTitle("Tic-Tac-Toe - 2nd player");
					isFirstPlayer = true;
				}
				else
				{
					buttonClicked.setText("O");
					window.setTitle("Tic-Tac-Toe - 1st player");
				}
				
				
				String dialogTitle = "";
				
				if (checkForWin())
				{
					if (isFirstPlayer)
						dialogTitle = "Congratulations First Player.";
					else 
						dialogTitle = "Congratulations Second Player. ";
					
					dialogTitle  = dialogTitle + "Do you want to play again? ";
				
					int reply = JOptionPane.showConfirmDialog(null, dialogTitle, "Game Over", JOptionPane.YES_NO_OPTION);
					
					if (reply == JOptionPane.YES_OPTION)
						resetButtons();
					else 
						System.exit(0);
				}
				
				if (checkAllButtonsFilled())
				{
					dialogTitle = "All Buttons Filled. ";
					dialogTitle  = dialogTitle + "Do you want to play again? ";
					
					int reply = JOptionPane.showConfirmDialog(null, dialogTitle, "Game Over", JOptionPane.YES_NO_OPTION);
					
					if (reply == JOptionPane.YES_OPTION)
						resetButtons();
					else 
						System.exit(0);
				}
				
				alternate++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "The button is filled. Try again");
			}
		}
		
		public boolean checkForWin()
		{
			if (b[0][0].getText() == b[0][1].getText() && b[0][1].getText() == b[0][2].getText() && !b[0][1].getText().equals(""))
				return true;
			else if (b[1][0].getText() == b[1][1].getText() && b[1][1].getText() == b[1][2].getText() && !b[1][1].getText().equals("")) 
				return true;
			else if (b[2][0].getText() == b[2][1].getText() && b[2][1].getText() == b[2][2].getText() && !b[2][1].getText().equals("")) 
				return true;
			else if (b[0][0].getText() == b[1][0].getText() && b[1][0].getText() == b[2][0].getText() && !b[1][0].getText().equals("")) 
				return true;
			else if (b[0][1].getText() == b[1][1].getText() && b[1][1].getText() == b[2][1].getText() && !b[1][1].getText().equals("")) 
				return true;
			else if (b[0][2].getText() == b[1][2].getText() && b[1][2].getText() == b[2][2].getText() && !b[1][2].getText().equals("")) 
				return true;
			else if (b[0][0].getText() == b[1][1].getText() && b[1][1].getText() == b[2][2].getText() && !b[1][1].getText().equals("")) 
				return true;
			else if (b[0][2].getText() == b[1][1].getText() && b[1][1].getText() == b[2][0].getText() && !b[1][1].getText().equals("")) 
				return true;
			else 
				return false;
		}
		
		public boolean checkAllButtonsFilled()
		{
			boolean isAllButtonsFilled = true;
			
			for (int c = 0; c <= 2; c++)
			{
				for (int r = 0; r <= 2; r++)
				{
					if (b[c][r].getText() == "")
						isAllButtonsFilled = false;
				}
			}
			
			return isAllButtonsFilled;
		}
	}
	
    public static void main(String[] args) 
    {
		window.setTitle("Tic-Tac-Toe - 1st player");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe());
        window.setBounds(500,400,500,500);
        window.setVisible(true);
    }
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac TicTacToe.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java TicTacToe


