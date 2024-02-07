package Program;

abstract class Bank
{
	int a = 100;
	int b = 150;
	int c = 200;
	
	public abstract void getbalance();
}
class BankA extends Bank
{
	public void getbalance()
	{
		System.out.println("BankA Balance is : "+a);
	}
}
class BankB extends Bank
{
	public void getbalance()
	{
		System.out.println("BankB Balance is : "+b);
	}
}
class BankC extends Bank
{
	public void getbalance()
	{
		System.out.println("BankC Balance is : "+c);
	}
}
public class P027 {

	public static void main(String[] args) {
		
		BankA b1 = new BankA();
		b1.getbalance();
		
		BankB b2 = new BankB();
		b2.getbalance();
		
		BankC b3 = new BankC();
		b3.getbalance();
		
	}
}
