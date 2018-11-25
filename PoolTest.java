//PoolTest.java
//Chapter 2, Section 4, Assignment 2
//Name: Joseph Charles Serrano
// 9/20/15
//QuickTest Program #5 (Exercise 2.4)
//page 114

public class PoolTest
{
	private double length;
	private double width;
	private double depth;
	
	//default constructor -------------------
	public PoolTest()
	{
		length = 25.0;
		width = 10.0;
		depth = 6.0;
		System.out.println("The pool's volume has to be calculated");
	}
	//---------------------------------------
	
	//added new constructor with arguments --
	public PoolTest(double l, double w, double d)
	{
		length = l; width = w; depth = d;
	}
	//---------------------------------------
	
	public void showValues()
	{
		System.out.println("length = " + length + "\n width = " + width + "\n depth = " + depth);
	}
	
	public void calculateVolume()
	{
		System.out.println(length * width * depth);
	}
	
	public static void main(String[] args)
	{
		PoolTest PoolOne;
		
		PoolOne = new PoolTest();
		
		System.out.println("\nThe values of the pool are: ");
		PoolOne.showValues();
		System.out.println("The pool's volume is: ");
		PoolOne.calculateVolume();
		
		
		//added lines -----------
		PoolOne = new PoolTest(3.0, 2.0, 6.0);
		System.out.println("\nThe values of the pool are: ");
		PoolOne.showValues();
		System.out.println("The pool's volume is: ");
		PoolOne.calculateVolume();
		//-----------------------
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac PoolTest.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java PoolTest
//The pool's volume has to be calculated

//The values of the pool are:
//length = 25.0
// width = 10.0
// depth = 6.0
//The pool's volume is:
//1500.0
