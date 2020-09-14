package day13;

class Table5 extends Thread{
	public void run()
	{
		for (int i=1; i<11;i++)
		{
			System.out.println("5 * "+i+" = "+5*i);
		}
	}
}
public class Q2_Threads extends Thread {
	public void run()
	{
	for (int i=2;i<41;i=i+2)
	{
		System.out.println(i+" is the even number");
	}
	}

	public static void main(String[] args) {
		Q2_Threads MainThread=new Q2_Threads();
		Table5 t1=new Table5();
		
		t1.start();
		MainThread.start();

	}

}
