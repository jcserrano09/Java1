//StudentStatus.java
//Chapter 5, Section 4, Assignment 3
//Name: Joseph Charles Serrano
// 10/11/15
//Exercise 5.4 #6 pg.270

import java.io.*;
public class StudentStatus
{
	public static String ShowStudentStatus(int code)
	{
		String StudentStatus = "";
		
		switch (code)
		{
			case 1:
				StudentStatus = "Freshman";
				break;
			case 2:
				StudentStatus = "Sophmore";
				break;
			case 3:
				StudentStatus = "Junior";
				break;
			case 4:
				StudentStatus = "Senior";
				break;
			case 5:
				StudentStatus = "Masters Program";
				break;
			case 6:
				StudentStatus = "Doctoral Program";
				break;
			default:
				StudentStatus = "An incorrect code was entered.";
				break;
		}
				
		return StudentStatus;
	}
	
	public static void main(String[] args)
	throws java.io.IOException
	{
		System.out.print("Enter a student code: ");
		int code = ID.readInt();
		String StudentStatus = ShowStudentStatus(code);
		System.out.println("The student status: " + StudentStatus);
	}
		
	

}