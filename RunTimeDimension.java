//RunTimeDimension.java
//Joseph Charles Serrano
//Chapter 8, Section 1, Assignment1
// 11/1/2015
//Exercise 8.1 #14 QuickTest Program 8.4 modify to enable user enter values 

import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;
public class RunTimeDimension
{
	public static void main(String[] args)
	{
		int i, numgrades; 
		String s1;
		
		s1 = JOptionPane.showInputDialog("Enter the number of grades to be processed: ");
		numgrades = Integer.parseInt(s1);
		
		int grade[] = new int[numgrades];
		
		System.out.println("An array was created for " + numgrades + " integers.");
			
        Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the grades: ");
		for(int j=0; j < numgrades; j++)
        {
            grade[j]=sc.nextInt();
        }
		
		System.out.println(" The values stored in the array have been initialized to:");
		for (i = 0; i < numgrades; i++)
			System.out.println("grade[" + i +"] is " + grade[i]);

		System.exit(0);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RunTimeDimension.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RunTimeDimension
//An array was created for 2 integers.
//Please enter the grades:
//60
//70
// The values stored in the array have been initialized to:
//grade[0] is 60
//grade[1] is 70
