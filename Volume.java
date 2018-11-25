//Volume.java
//Chapter 3, Assignment 6
//Name: Joseph Charles Serrano
//9/27/15
//Chapter 3 Test

public class Volume
{
	private double length;
	private double width;
	private double height;
	
	public double VolumePara(double len, double wid, double hei)
	{
		double Volume;
		length = len;
		width = wid;
		height = hei; 
		Volume = length * width * height;
		return Volume;
	}
	
	public void DisplayDimensions()
	{
		System.out.print("the volume of a " + length + "x" + width + "x" + height);
	}
	
	public static void main(String[] args)
	{
	    Volume Vol;
		Vol = new Volume();
		
		double v = Vol.VolumePara(3.0, 3.0, 6.0);
		Vol.DisplayDimensions();
		System.out.println(" is " + v );
		
	}

	
	
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Volume.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Volume

// The volume of a 3x3x6 cube is
// cubic feet 54.0
