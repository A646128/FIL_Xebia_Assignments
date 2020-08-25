package day6;

interface IinsertDelete{
	void insertMethod1();
	void insertMethod2();
	void deleteinsertMethod1();
	void deleteinsertMethod2();
	
}
class InsertDelete implements IinsertDelete{

	@Override
	public void insertMethod1() {
		System.out.println("First In");
		
	}

	@Override
	public void insertMethod2() {
		System.out.println("Second In \n");
		
	}

	@Override
	public void deleteinsertMethod1() {
		System.out.println("First Out");
		
	}

	@Override
	public void deleteinsertMethod2() {
		System.out.println("Second Out");
		
	}
	
}

public class QueueInterface {

	public static void main(String[] args) {
		IinsertDelete id=new InsertDelete();
		System.out.println("Queue Interface works as below:");
		id.insertMethod1();
		id.insertMethod2();
		id.deleteinsertMethod1();
		id.deleteinsertMethod2();
	      	}

}
