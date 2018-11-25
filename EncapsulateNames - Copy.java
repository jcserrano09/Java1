//EncapsulateNames.java
//Chapter 3, Section 4, Assignment 3
//Name: Joseph Charles Serrano
//9/27/15
//Program 3.6; pg 156

public class EncapsulateNames
{
	private String nameOne;
	private String nameTwo;
	
	//-----------------------
	private String nameThree;
	//I added another String--
	
	public EncapsulateNames(String s1, String s2, String s3)
	{
		nameOne = s1;
		nameTwo = s2;
		
		//-------
		nameThree = s3;
		//-------^
	}
	
public String getFirst(){return nameOne;}
public String getSecond(){return nameTwo;}

//----------------
public String getThird(){return nameThree;}
//----------------^

public void setAName(String s1){nameOne = s1;}
public void setBName(String s2){nameTwo = s2;}

//-----------------
public void setCName(String s3){nameThree = s3;}
//-----------------^

//Chapter 3 Section 4 Assignment 4
//swap method

public void swap()
{
	String temp; 
	
	temp = nameOne;
	nameOne = nameTwo;
	nameTwo = temp;
}
}