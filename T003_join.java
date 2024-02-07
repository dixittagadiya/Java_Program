package Thread;

class Demo extends Thread
{
	public void display() {
		for(int i =1; i<=10; i++)
		{
			System.out.println(currentThread().getName()+" "+i);
		}
	}
}
public class T003_join {

	public static void main(String[] args) {

		Demo d = new Demo();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}

}