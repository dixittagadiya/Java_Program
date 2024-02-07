package Program;

class Parent
{
	public void parent()
	{
		System.out.println("This is a parent class..");
	}
}
class Child extends Parent
{
	public void child()
	{
		System.out.println("This is a child class..");
	}
}
public class P022 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		p.parent();
		c.child();
		c.parent();
		
		
	}
}
