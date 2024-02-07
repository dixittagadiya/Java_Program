package Thread;

class thr1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
//			try {
//				sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Th-1 :"+i);
		}
	}
}
class thr2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("Th-2 :"+i);
		}
	}
}
public class T001_Thread {

	public static void main(String[] args) {

		thr1 th1 = new thr1();
		thr2 th2 = new thr2();
		
//		th1.run();
//		th2.run();
		
		th1.start();
		th2.start();
		
		
		th1.setName("A");
	}

}
