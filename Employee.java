//Employee.java
//Chapter 3, Section 5, Assignment 5
//Name: Joseph Charles Serrano
//9/27/15
//Define what a are static and final variables
//Exercise 3.10
//pg 161

//Definitions:

// Static Variable - created only once for each class, is shared by all objects created from the class, and exists even if no object is instantiated; declared in the same way as instance variables

// Final Variable - created to have an intial value and that the value can not be changed; value is constant

public class Employee
{
	private static int numEmployees;
	private static double taxRateOne = 0.025;
	// Adding another taxrate
	private static double taxRateTwo = 0.5;
	//I added the age of the employee
	private int Age;
	private int idNum;
	
	public Employee(int num, int a)
	{
		Age = a;
		idNum = num;
		numEmployees++;
	}
	
	public void showValues()
	{
		//if then else statement for checking age and show appropiate taxrate
		if (Age < 65)
		{
			System.out.println("Employee number" + idNum + " has a tax rate of " + taxRateTwo + ".\n"); 
		}
		else
		{
			System.out.println("Employee number" + idNum + " has a tax rate of " + taxRateOne + ".\n"); 
		}
	
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("The value in numEmployees is " + numEmployees);
		// age < 65 and age > or = 65
		System.out.println("The tax rate for all employees with age < 65 is " + taxRateTwo + '\n');
		System.out.println("The tax rate for all employees with age >= 65 is " + taxRateOne + '\n');
		
		Employee BSMITH = new Employee(11122, 70);
		System.out.println("The number of employees is now " + numEmployees);
		BSMITH.showValues();
		
		Employee JJONES = new Employee(11133, 40);
		System.out.println("The number of employees is now " + numEmployees);
		JJONES.showValues();
	}
} 

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac Employee.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java Employee
//The value in numEmployees is 0
//The tax rate for all employees with age < 65 is 0.5

//The tax rate for all employees with age >= 65 is 0.025

//The number of employees is now 1
//Employee number11122 has a tax rate of 0.025.

//The number of employees is now 2
//Employee number11133 has a tax rate of 0.5.
