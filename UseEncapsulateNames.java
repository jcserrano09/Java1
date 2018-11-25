//UseEncapsulateNames.java
//Chapter 3, Section 4, Assignment 3
//Name: Joseph Charles Serrano
//9/27/15
//Program 3.7; pg 156

public class UseEncapsulateNames
{
	public static void main(String[] args)
	{
		String firstName = "Billings";
		String secName = "Ajax";
		String thirdName = "Lawrence";
		//added a thirdName-----^
		EncapsulateNames nameGroup;
		//changed namePair to nameGroup
		
		nameGroup = new EncapsulateNames(firstName, secName, thirdName);
		System.out.println("The first name is " + nameGroup.getFirst());
		System.out.println("The secong name is " + nameGroup.getSecond());
		
		//-----------
		System.out.println("The third name is " + nameGroup.getThird());
		//----------^
		
		nameGroup.setAName("Calisto");
		nameGroup.setBName("Breyer");
		nameGroup.setCName("Arnesto");
		//thirdName-----------^
		System.out.println("\nThe first name is " + nameGroup.getFirst());
		System.out.println("The secong name is " + nameGroup.getSecond());
		
		//----------
		System.out.println("The third name is " + nameGroup.getThird());
		//-------------------^
	}
}



//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac EncapsulateNames.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac UseEncapsulateNames.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java UseEncapsulateNames
//The first name is Billings
//The secong name is Ajax

//The first name is Calisto
//The secong name is Breyer

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac EncapsulateNames.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac UseEncapsulateNames.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java UseEncapsulateNames
//The first name is Billings
//The secong name is Ajax
//The third name is Lawrence

//The first name is Calisto
//The secong name is Breyer
//The third name is Arnesto

