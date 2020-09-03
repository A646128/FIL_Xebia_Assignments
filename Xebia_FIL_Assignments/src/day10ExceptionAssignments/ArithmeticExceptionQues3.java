package day10ExceptionAssignments;

public class ArithmeticExceptionQues3 {

	public static void main(String[] args) {
		try{
			int c = 10/0;
		}catch (ArithmeticException e)
		{
			System.out.println("Number can not divide by zero, Please correct its code.");
		}
		
		

	}

}
