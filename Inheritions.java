package Oops;

class A
{
	int id=20;
	
	public void display()
	{
	
		this.id = 10;
		System.out.println("ID 1 :" + this.id);
	}
}
class B extends A
{	

	int id = 30;
	public void run()
	{
		System.out.println("ID 2 :" + this.id);
	}
}
class C extends B
{
	public void system()
	{
		System.out.println("ID 3 :" + super.id);
	}
}
public class Inheritions {

	public static void main(String[] args) {

		C c = new C();
		c.display();
		c.run();
		c.system();
	}

}
