//EncapsulateNames.java
//Chapter 3, Section 4, Assignment 3
//Name: Joseph Charles Serrano
//9/27/15
//Program 3.6; pg 156

//*MODIFIED* Modified for assignment 4 below the program

public class EncapsulateNames
{
	public String name;
	
	//private String nameOne;
	//private String nameTwo;
	
	//-----------------------
	//private String nameThree;
	//I added another String--
	
	public EncapsulateNames()
	{
		
	}
	
	//public EncapsulateNames(String s1, String s2, String s3)
	//{
	//	nameOne = s1;
	//	nameTwo = s2;
	//	
	//	//-------
	//	nameThree = s3;
	//	//-------^
	//}
	
//public String getFirst(){return nameOne;}
//public String getSecond(){return nameTwo;}

//----------------
//public String getThird(){return nameThree;}
//----------------^

//public void setAName(String s1){nameOne = s1;}
//public void setBName(String s2){nameTwo = s2;}

//-----------------
//public void setCName(String s3){nameThree = s3;}
//-----------------^


//Chapter 3 Section 4 Assignment 4
//Exercise 3
//Page 159
//swap method

	public void swap(EncapsulateNames secName)
	{
		String temp; 

		temp = secName.name;	
		secName.name = name;
		name = temp;
		
		//temp = nameOne;
		//nameOne = nameTwo;
		//nameTwo = temp;
	}
	
	public static void main(String[] args)
	{
		EncapsulateNames AName = new EncapsulateNames();
		AName.name = "Charles";
		System.out.println("\n AName is " + AName.name);
		
		EncapsulateNames BName = new EncapsulateNames()	;
		BName.name = "Joseph";
		System.out.println("\n BName is " + BName.name);
		
		AName.swap(BName);
		
		System.out.println("\n AName is " + AName.name);
		System.out.println("\n BName is " + BName.name);
		
	}
}
//Output of Exercise 3 PG 159
//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac EncapsulateNames.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java EncapsulateNames

 //AName is Charles

 //BName is Joseph

 //AName is Joseph

//BName is Charles
