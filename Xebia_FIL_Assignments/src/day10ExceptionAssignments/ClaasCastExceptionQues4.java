package day10ExceptionAssignments;

class ParentTest {
	   String parentName;
	   ParentTest(String n1){
	      parentName = n1;
	   }
	   public void display() {
	      System.out.println(parentName);
	   }
	}
	class ChildTest extends ParentTest {
	   String childName;
	   ChildTest(String n2) {
	      super(n2);
	      childName = n2;
	   }
	   public void display() {
	      System.out.println(childName);
	   }
	}
public class ClaasCastExceptionQues4 {

	public static void main(String[] args) {
		ChildTest ct1 = new ChildTest("Ram");
	      ParentTest pt1 = new ParentTest("Shyam");
	      pt1 = ct1;
	      pt1.display();

	      try{
	    	 ParentTest pt2 = new ParentTest("Sai");
	  	     @SuppressWarnings("unused")
	  	     ChildTest ct2 = (ChildTest)pt2;  
	      }
	      catch(ClassCastException e)
	      {
	    	  System.out.println("Getting ClassCastException here, Please correct its code.");
	      }
	  
		

	}

}
