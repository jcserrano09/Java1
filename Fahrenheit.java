//Fahrenheit.java
//Chapter 3, Assignment 2
//Name: Joseph Charles Serrano
//9/27/15
//Exercise 3.2, #5
//pg 145

public class Fahrenheit
{
	double temperature;
	
	//constructor
	public Fahrenheit()
	{
		temperature = 64.0;
	}
	
	//accessor
	public void showValues()
	{
		System.out.println("Temperature = " + temperature);
	}
	
	//method
	public double celsiusValue()
	{
		double celsius;
		celsius = 5.0 / 9.0 * (temperature - 32.0);
		return celsius;
	}
	
	//mutator
	public void newTemp()
	{
		temperature = 72.0;
	}
	
	//main()
	public static void main(String[] args)
	{
	Fahrenheit tempOne;
	tempOne = new Fahrenheit();
	
	System.out.println("\n The temperature in Fahrenheit is ");
	tempOne.showValues();
	System.out.println("\n The temperature in Celsius is");
	double cel = tempOne.celsiusValue();
	System.out.println("Temperature = " + cel);
	
	tempOne.newTemp();
	
	System.out.println("\n The temperature in Fahrenheit is ");
	tempOne.showValues();
	System.out.println("\n The temperature in Celsius is");
	cel = tempOne.celsiusValue();
	System.out.println("Temperature = " + cel);

	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Fahrenheit.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Fahrenheit

//The temperature in Fahrenheit is
//Temperature = 64.0
// The temperature in Celsius is
//Temperature = 17.77777777777778

 //The temperature in Fahrenheit is
//Temperature = 72.0

 //The temperature in Celsius is
//Temperature = 22.22222222222222