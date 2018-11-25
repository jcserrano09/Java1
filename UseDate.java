//UseDate.java
//Chapter 5, Section 6, Assignment 4
//Name: Joseph Charles Serrano
// 10/11/15
//Exercise 5.6 #6 pg.289

public class UseDate
{
	public static void main(String[] args)
	{
		Date firstDate;
		Date secondDate;
		
		firstDate = new Date();
		secondDate = new Date(5,1,2006);
		
		firstDate.showDate();
		firstDate.convert();
		secondDate.showDate();
		secondDate.convert();
		
		secondDate.setDate(12,25,2007);
		secondDate.showDate();
		secondDate.convert();
	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Date.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac UseDate.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java UseDate
//From the default constructor:
// Created a new Date object with date values
        //month = 7       day = 4 year = 2005

//From the overloaded constructor:
// Created a new Date object with date values
        //month = 5       day = 1 year = 2006

//The date is 07/04/05
//The date in integer format is 20050704
//The date is 05/01/06
//The date in integer format is 20060501
//The date is 12/25/07
//The date in integer format is 20071225
