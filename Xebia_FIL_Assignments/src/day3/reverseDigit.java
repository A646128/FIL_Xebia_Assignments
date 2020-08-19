package day3;

import java.util.Scanner;

public class reverseDigit {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number which has to be reversed: ");
		long num=sc.nextLong();
		int i=10;
		System.out.print("Number after reversing the digit: ");
		while(num!=0)
		{
		long reverse=num%i;
		System.out.print(reverse);
		num=num/i;
		}

	}

}
