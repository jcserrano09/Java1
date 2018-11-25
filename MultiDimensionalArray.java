//MultiDimensionalArray.java
//Joseph Charles Serrano
//Chapter 8, Section 6, Assignment 4
// 11/1/2015
//Exercise 8.6 #4

public class MultiDimensionalArray
{
	public static void main(String[] args)
	{
		int i, j;
		int first[][] = {{16, 18, 23},{54,91,11}};
		int second[][] = {{24, 52, 77},{16,19,59}};
		int sumArray[][] = new int[2][3];
		
		System.out.println("First Array: ");
		for (i = 0; i < first.length; i++) {
			for (j = 0; j < first[i].length; j++)
				System.out.print(first[i][j]+"  ");
			System.out.println("");
		}
		
		System.out.println("Second Array: ");		
		for (i = 0; i < second.length; i++) {
			for (j = 0; j < second[i].length; j++)
				System.out.print(second[i][j]+"  ");
			System.out.println("");
		}
		
		for (i = 0; i < sumArray.length; i++)
			for (j = 0; j < sumArray[i].length; j++)
				sumArray[i][j] = first[i][j] + second[i][j];
		
		System.out.println("Sum Array: ");		
		for (i = 0; i < sumArray.length; i++) {
			for (j = 0; j < sumArray[i].length; j++)
				System.out.print(sumArray[i][j]+"  ");
			System.out.println("");

		}

	}
}

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>javac MultiDimensionalArray.java

//C:\Users\Charles\Documents\Charles_rec\JAVA lesson>java MultiDimensionalArray
//First Array:
//16  18  23
//54  91  11
//Second Array:
//24  52  77
//16  19  59
//Sum Array:
//40  70  100
//70  110  70
