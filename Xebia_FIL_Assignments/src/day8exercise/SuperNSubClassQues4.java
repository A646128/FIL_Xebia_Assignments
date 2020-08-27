package day8exercise;

class Superclass{
	public void func(){
		
		
		System.out.println("My ancestor is a cycle who is a vehicle with pedals");
	}
}
class Subclass extends Superclass
{
	public void func()
	{
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
		super.func();
	}
}

public class SuperNSubClassQues4 {

	public static void main(String[] args) {
		Subclass sc = new Subclass();
		sc.func();

	}

}
