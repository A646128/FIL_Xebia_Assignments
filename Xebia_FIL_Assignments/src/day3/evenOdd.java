package day3;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number: ");
		long num=sc.nextLong();
		if (num%2==0)
		{
			System.out.println("The given number is Even");
		}
		else
		{
			System.out.println("The given number is Odd");
		}

	}

}
