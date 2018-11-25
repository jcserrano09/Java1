//RoomType.java
//Chapter 2, Section 3, Assignment 2
//Name: Joseph Charles Serrano
//9/20/15
// Program 2.5
//page 100-101

public class RoomType
{
	private double length;
	private double width;
	
	public RoomType()
	{
		length = 25.0;
		width = 12.0;
		System.out.println("Create a new room object using the default constructor\n");
	}
	
	public void showValues()
	{
		System.out.println(" length = " + length + "\n width = " + width);
	
	}
	
	public void setNewValues()
	{
		length = 12.5;
		width = 9.0;
	}
	
	//I've added another room having the length = 13.3 and width = 24.0
	public void setMoreValues()
	{
		length = 13.3;
		width  = 24.0;
	}
	
	public void calculateArea()
	{
		System.out.println(length * width);
	}
	
	public static void main(String[] args)
	{
		RoomType roomOne;
		
		roomOne = new RoomType();
		
		System.out.println("\nThe values for this room are:");
		roomOne.showValues();
		System.out.println("The floor area of this room is: ");
		roomOne.calculateArea();
		
		roomOne.setNewValues();
		
		System.out.println("\nThe values for this room have been changed to: ");
		roomOne.showValues();
		System.out.print("The floor area of this room is: ");
		roomOne.calculateArea();
		
		//This is where I've added another room
		roomOne.setMoreValues();
		
		System.out.println("\nThe values of this room have been changed to: ");
		roomOne.showValues();
		System.out.print("The floor area of this room is: ");
		roomOne.calculateArea();
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RoomType.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RoomType
//Create a new room object using the default constructor


//The values for this room are:
 //length = 25.0
 //width = 12.0
//The floor area of this room is:
//300.0

//The values for this room have been changed to:
 //length = 12.5
// width = 9.0
//The floor area of this room is: 112.5

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RoomType.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RoomType
//Create a new room object using the default constructor


//The values for this room are:
// length = 25.0
 //width = 12.0
//The floor area of this room is:
//300.0

//The values for this room have been changed to:
// length = 12.5
// width = 9.0
//The floor area of this room is: 112.5

//The values of this room have been changed to:
// length = 13.3
// width = 24.0
//The floor area of this room is: 319.20000000000005

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>