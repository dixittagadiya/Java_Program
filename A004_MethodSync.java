package Thread;

class Table extends Thread
{
	public synchronized void run(int num)
	{
		System.out.println("Enter The Num :");
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
	}

	public void print(int i) {
		// TODO Auto-generated method stub
		
	}
}
class Table1 extends Thread
{
	Table t;
	public Table1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(5);
	}
}
class Table2 extends Thread
{
	Table t;
	public Table2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.print(7);
	}
}
public class A004_MethodSync {

	public static void main(String[] args) {

		Table tb = new Table();
		
		Table1 t1 = new Table1(tb);
		Table2 t2 = new Table2(tb);
		
		t1.start();
		t2.start();
		
		
	}

}
