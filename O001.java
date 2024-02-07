package Oops;



class parent
{
	int a=10;
	int b=20;
	public void display()
	{
		System.out.println("Calling..." +a);
		
	}
}

class children extends parent
{
	public void run()
	{
		System.out.println("call..." +a);
	}
}
class employ extends children
{
	public void fast()
	{
		System.out.println("Show.." +b);
	}
}

public class O001 {

	public static void main(String[] args) {
		employ p = new employ();
		p.display();
		p.run();
		p.fast();
		
		
	}

}