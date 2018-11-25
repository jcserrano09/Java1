//RoomTypeOne.java
//Chapter 3, Section 1, Assignment 1
//Name: Joseph Charles Serrano
//9/27/15
//Program 3.2; pg 132-133


public class RoomTypeOne
{
	private double length;
	private double width;
	private double height;
	// I've added a new value, height
	public RoomTypeOne()
	{
		length = 25.0;
		width = 12.0;
		height = 5.0;
		
		System.out.println("Created a new room object using the default constructor\n");
	
	}
	
	public void showValues()
	{
		// added height
		System.out.println(" length = " + length + "\n width = " + width + "\n height = " + height);
	}
	//added hei = height
	public void setNewValues(double len, double wid, double hei)
	{
		length = len;
		width = wid;
		height = hei;
	}
	//I changed calculateArea() to calculateVolume
	public void calculateVolume()
	{
		System.out.println(length * width * height);
	}
	
	public static void main(String[] args)
	{
		RoomTypeOne roomone;
		
		roomone = new RoomTypeOne();
		
		System.out.println("\n The new values of this room are:");
		roomone.showValues();
		System.out.println("The floor volume of this room is: ");
		roomone.calculateVolume();
		
		roomone.setNewValues(6.2, 3.5, 1.5);
		
		System.out.println("\nThe new values of this room have been changed to:");
		roomone.showValues();
		System.out.println("The floor volume of this room is: ");
		roomone.calculateVolume();
		
		roomone.setNewValues(2.4, 21.3, 3.2);
		
		//I added another setNewValues()
		System.out.println("\nThe new values of this room have been changed to:");
		roomone.showValues();
		System.out.println("The floor volume of this room is: ");
		roomone.calculateVolume();
		
	}
}


//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RoomTypeOne.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RoomTypeOne
//Created a new room object using the default constructor


 //The new values of this room are:
 //length = 25.0
 //width = 12.0
//The floor area of this room is:
//300.0

//The new values of this room have been changed to:
// length = 6.2
 //width = 3.5
//The floor area of this room is:
//21.7

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RoomTypeOne.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RoomTypeOne
//Created a new room object using the default constructor


 //The new values of this room are:
// length = 25.0
// width = 12.0
//The floor area of this room is:
//300.0

//The new values of this room have been changed to:
 //length = 6.2
 //width = 3.5
//The floor area of this room is:
//21.7

//The new values of this room have been changed to:
 //length = 2.4
// width = 21.3
//The floor area of this room is:
//51.12
	
//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac RoomTypeOne.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java RoomTypeOne
//Created a new room object using the default constructor


 //The new values of this room are:
 //length = 25.0
 //width = 12.0
// height = 5.0
//The floor volume of this room is:
//1500.0

//The new values of this room have been changed to:
 //length = 6.2
 //width = 3.5
 //height = 1.5
//The floor volume of this room is:
//32.55

//The new values of this room have been changed to:
 //length = 2.4
 //width = 21.3
// height = 3.2
//The floor volume of this room is:
//163.584





