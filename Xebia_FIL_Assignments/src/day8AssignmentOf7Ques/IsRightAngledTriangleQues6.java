package day8AssignmentOf7Ques;

import java.util.Scanner;

class Ques6{
	public static boolean isRightAngledTriangle(int a, int b, int c)
	{
		if(a>b&&a>c)
	     {
	         if((a*a)==(b*b)+(c*c))
	         {
	         System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle");
	         return true;
	         }
	         else 
	         {
	         System.out.println("This isn't a right angled triangle"); 
	         return false;
	         }
	     }
	      if(b>c&&b>a)
	        {
	            if((b*b)==(c*c)+(a*a))
	            {
	            System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle");
	            return true;
	            }
		        else 
		        {
			    System.out.println("This isn't a right angled triangle"); 
			    return false;
			    }
	         }
	      if(c>a&&c>b)
	        {
	            if((c*c)==(a*a)+(b*b))
	            {
	            System.out.println("This is the classic example of a " +"\"nice\""+" right angled triangle");
	            return true;
	            }
		        else 
		        {
			         System.out.println("This isn't a right angled triangle"); 
			         return false;
			    }
	        }
		return false;
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
		System.out.println("Sides of the triangle are: "+a+" "+b+" "+c);
		System.out.println();
		Ques6.isRightAngledTriangle(a, b, c);
	}

}
