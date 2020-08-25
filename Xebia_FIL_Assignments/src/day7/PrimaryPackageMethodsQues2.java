package day7;

public class PrimaryPackageMethodsQues2 {
	public static void subtract(double a, double b)
	{
		System.out.println("Subtraction Result: "+(a-b));
	}
	public static void multiple(double a, double b)
	{
		System.out.println("Multiplication Result: "+(a*b));
	}
	public static void divide(double a, double b)
	{
		System.out.println("Division Result: "+(a/b));
	}
	public static void factorial(long a)
	{
		int i,fact=1;
		for(i=1;i<=a;i++){
		fact=fact*i;
		}
		System.out.println("Factorial Result: "+fact);
	}
	public static void reverse(long num)
	{
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
