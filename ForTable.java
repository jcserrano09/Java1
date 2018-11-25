//ForTable.java
//Chapter 6, Section 4, Assignment 3
//Name: Joseph Charles Serrano
// 10/18/15
//Exercise 6.4 #2 pg.331 modify Program 6.10 to produce # 0 - 20

import java.text.*;
public class ForTable
{
	public static void main(String[] args)
	{
		int num;
		
		DecimalFormat df = new DecimalFormat("0000");
		System.out.println("NUMBER		SQUARE		CUBE");
		System.out.println("------		------		----");
		
		for (num = 0; num <= 20; num = num + 2)
		{
			System.out.print("	" + df.format(num));
			System.out.print("		" + df.format(num * num));
			System.out.println("		" + df.format(num * num * num));
		}
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac ForTable.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java ForTable
//NUMBER          SQUARE          CUBE
//------          ------          ----
//        0000            0000            0000
//        0002            0004            0008
//        0004            0016            0064
//        0006            0036            0216
//        0008            0064            0512
//        0010            0100            1000
//        0012            0144            1728
//        0014            0196            2744
//        0016            0256            4096
//        0018            0324            5832
//        0020            0400            8000
