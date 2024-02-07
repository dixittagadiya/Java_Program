package Thread;

class th1 extends Thread
{
	public void run()
	{
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class T002_ThreadPriority {

	public static void main(String[] args) {

		th1 th1 = new th1();
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		
		t1.setPriority(6);
		t2.setPriority(8);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
