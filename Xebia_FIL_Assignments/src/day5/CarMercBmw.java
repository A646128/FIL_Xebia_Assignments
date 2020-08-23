package day5;

 class Car{	
	 public void display(){
		System.out.println("Display method of Car");
	}
	 public void test(){
		 System.out.println("Display method of Test");
	 }
}
 class Merc extends Car{
	@Override
	public void display() {
		System.out.println("Display method of Mercedes Car");
	}	
}
 class Bmw extends Car{

	@Override
	public void display() {
		System.out.println("Display method of BMW Car");
	}
	 
 }

public class CarMercBmw {
	public static void main(String[] args) {
		 Car c= new Car();
		 c.display();
		 c= new Merc();
		 c.display();
		 c= new Bmw();
		 c.display();
	}

}
