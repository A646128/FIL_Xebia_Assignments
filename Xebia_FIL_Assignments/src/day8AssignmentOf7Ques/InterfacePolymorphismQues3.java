package day8AssignmentOf7Ques;

import java.util.Scanner;

interface IAdvancedArithmetic{
	  int divisor_sum(int n);
}

class MyCalculator implements IAdvancedArithmetic{

	@Override
	 public int divisor_sum(int n) {
			int sum = 0;
			for (int i=1;i<n+1;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
		return sum;
		
	}
	
}

public class InterfacePolymorphismQues3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a= sc.nextInt();
		if (a<1001)
		{
		MyCalculator mcalc=new MyCalculator();
		System.out.println("Sum of all divisors of "+a+" is "+mcalc.divisor_sum(a));
		}
		else
		{
			System.out.println("Enter the Number not greater than 1000");
		}

	}

}
