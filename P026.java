package Program;

abstract class Parent1
{
	public abstract void massage();
}
class SubclassA extends Parent1
{
	public void massage()
	{
		System.out.println("First Subclass...");
	}
}
class SubclassB extends Parent1
{
	public void massage()
	{
		System.out.println("Second Subclass...");
	}
}
public class P026 {

	public static void main(String[] args) {
		
		SubclassA s1 = new SubclassA();
		SubclassB s2 = new SubclassB();
		
		s1.massage();
		s2.massage();
		
	}
}
