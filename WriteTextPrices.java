//WriteTextPrices.java
//Joseph Charles Serrano
// 11/28/15
// Chapter 12, Section 2, Assignment 2
//Enter and run program 12.1 

import java.io.*;
public class WriteTextPrices
{
	public static void main(String[] args)
	
	throws java.io.IOException
	{
		FileWriter fw = new FileWriter("prices.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("Mats 39.95");
		pw.println("Bulbs 3.22");
		pw.println("Fuses 1.08");
		
		pw.close();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac WriteTextPrices.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java WriteTextPrices
