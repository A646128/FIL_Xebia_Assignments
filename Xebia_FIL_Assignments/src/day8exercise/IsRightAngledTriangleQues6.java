package day8exercise;

import java.util.Scanner;

class Ques6{
	public static void isRightAngledTriangle(int a, int b, int c)
	{
		if(a>b&&a>c)
	     {
	         if((a*a)==(b*b)+(c*c))
	         {
	         System.out.println("TRUE");
	         System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle.");
	         }
	         else 
	         {
	         System.out.println("FALSE");
	         System.out.println("This isn't a right angled triangle."); 
	         }
	     }
	      if(b>c&&b>a)
	        {
	            if((b*b)==(c*c)+(a*a))
	            {
	            System.out.println("TRUE");
	            System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle.");
	            }
		        else 
		        {
			         System.out.println("FALSE");
			         System.out.println("This isn't a right angled triangle."); 
			     }
	         }
	      if(c>a&&c>b)
	        {
	            if((c*c)==(a*a)+(b*b))
	            {
	            System.out.println("TRUE");
	            System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle.");
	            }
		        else 
		        {
			         System.out.println("FALSE");
			         System.out.println("This isn't a right angled triangle."); 
			    }
	        }
	}
}
public class IsRightAngledTriangleQues6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter the side of the triangle:");
		Scanner sc= new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Sides of the tringle are: "+a+" "+b+" "+c);
		System.out.println();
		Ques6.isRightAngledTriangle(a, b, c);
	}

}
