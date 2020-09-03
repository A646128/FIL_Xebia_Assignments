package day10ExceptionAssignments;

public class ArrayIndexOutOfBoundExceptionQues1 {

	public static void main(String[] args) {
		int i=1;
		int []arr=new int [1];
		try{
			arr[i+1]=2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The Array Index has been Out of Bound, Please correct its code.");
		}

	}

}
