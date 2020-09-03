package day10ExceptionAssignments;

public class NullPointerExceptionQues5 {

	public static void main(String[] args) {
		Object obj = null;
		try{
		obj.toString();
		}catch(NullPointerException e)
		{
			System.out.println("null Object can not be converted to String, Please correct its code.");
		}

	}

}
