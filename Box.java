//Box.java
//Joseph Charles Serrano
//Chapter 11, Section 3, Assignment 1
// 11/22/15
//Inherit the base class rectangle to produce the results of an area and a volume

public class Box extends Rectangle
{
	protected double depth;

	
	public Box(double l, double w, double d)
	{
		super(l, w);
		depth = d;
	}
	
	public double area()
	{
		return (super.area());
	}
	
	public double volume()
	{
		return (depth * super.area());
	}
	
	public static void main(String[] args)
	{
		Box boxOne = new Box(2, 2, 2); 
		Box boxTwo = new Box(2, 2, 2);
		
		System.out.println("The area of boxOne is " + boxOne.area());
		System.out.println("The volume of boxTwo is " + boxTwo.volume());
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Box.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Box
//The area of boxOne is 4.0
//The volume of boxTwo is 8.0