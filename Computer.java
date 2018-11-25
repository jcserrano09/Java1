//Computer.java
//Chapter 3, Section 1, Assignment 1
//Name: Joseph Charles Serrano
//9/27/15
//Exercise 3.1 #4c.
//pg 136

public class Computer
{
	public String computer;
	public String printer;
	public String screen;
	
	double compPrice;
	double printPrice;
	double screenPrice;
	
	//constructor
	public Computer()
	{
		compPrice = 400.0;
		printPrice = 300.0;
		screenPrice = 150.0;
		
		computer = "ComputerOne";
		printer = "PrinterOne";
		screen = "ScreenOne";
		System.out.println("The prices of a computer, printer, and a screen.");
	}
	
	//accessor
	public void showData()
	{
		System.out.println(computer + " " + compPrice);
		System.out.println(printer + " " + printPrice); 
		System.out.println(screen + " " + screenPrice);
	}
	
	//mutator
	public void setNewData(double comP, double priP, double scrP, String comp, String prin, String scr)
	{
		compPrice = comP;
		printPrice = priP;
		screenPrice = scrP;
		
		computer = comp;
		printer = prin;
		screen = scr;
	}
	
	//main() method
	public static void main(String[] args)
	{
		Computer compOne;
		compOne = new Computer();
		
		System.out.println("\n The prices are: ");
		compOne.showData();
		
		compOne.setNewData(500.0, 400.0, 100.0, "ComputerTwo", "PrinterTwo", "ScreenTwo");
		
		System.out.println("\n The prices are: ");
		compOne.showData();
	}
	
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Computer.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Computer
//The prices of a computer, printer, and a screen.

// The prices are:
//ComputerOne 400.0
//PrinterOne 300.0
//ScreenOne 150.0

// The prices are:
//ComputerTwo 500.0
//PrinterTwo 400.0
//ScreenTwo 100.0

