//Rectangle.java
//Joseph Charles Serrano
//Chapter 11, Section 3, Assignment 1
// 11/22/15
// Create a base class called Rectangle for it to be used by the class box

public class Rectangle
{
	protected double length;
	protected double width;
	
	public Rectangle(double l,double w)
	{
		length = l;
		width = w;
	}
	
	public double area()
	{
		return(length * width);
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Rectangle.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>