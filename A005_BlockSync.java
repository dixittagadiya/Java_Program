package Thread;

import java.util.Scanner;

class Account extends Thread
{
	double balance;
	public Account(double balance)
	{
		this.balance=balance;
	}
	public void withdraw(double amt)
	{
		if(amt>balance)
		{
			System.out.println("REVA DE BHAI...");
		}
		else
		{
			balance-=amt;
			System.out.println("your balance :"+balance);
		}
	}
}
class customer extends Thread
{
	Account a;
	String name;
	
	public customer(Account a , String name )
	{
		this.a=a;
		this.name=name;
	}
	
	Scanner sc = new Scanner(System.in);
	public void run()
	{
		synchronized (a) {
		System.out.println("Ketla Upad va chhe... :"+name);
		double amt = sc.nextDouble();
		a.withdraw(amt);
		}
	}
}
public class A005_BlockSync {

	public static void main(String[] args) {

		Account a1 = new Account(5000);
		
		customer c1 = new customer(a1,"abc");
		customer c2 = new customer(a1, "xyz");
		
		c1.start();
		c2.start();
		
		
		
	}

}
