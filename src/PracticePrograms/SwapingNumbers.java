package PracticePrograms;

import java.util.Scanner;

public class SwapingNumbers {

	public static void main(String[] args) 
	{
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1=  Sc.nextInt();
		System.out.println("Enter second number:");
		int num2=  Sc.nextInt();
		System.out.println("values before swapping :"+num1 +" " +num2);
		int swap ;
		swap=num1;
		num1=num2;
		num2=swap;
		System.out.println("values after swapping :"+num1 +" "+num2);
		
		 
		

	}

}
