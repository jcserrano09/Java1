//FallTime.java
//Chapter 4, Section 5, Assignment 6
//Name: Joseph Charles Serrano
// 10/4/15
//Exercise 4.5 #7 pg.231

import java.text.*;
public class FallTime
{
	public static void main(String[] args)
	{
		int height;
		double time;
		//original
		//DecimalFormat df = new DecimalFormat("#.00");
		//modified the DecimalFormat to have 4 zeroes
		DecimalFormat df = new DecimalFormat("#.0000");
		
		height = 800;
		time = Math.sqrt(2 * height / 32.2);
		System.out.println("It will take " + df.format(time) + "seconds to fall " + height + " feet. ");
	}
}

//Before modifying program 4.11 
//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac FallTime.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java FallTime
//It will take 7.05seconds to fall 800 feet.



//After modifying program 4.11
//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac FallTime.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java FallTime
//It will take 7.0491seconds to fall 800 feet.
