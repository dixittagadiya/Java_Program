package Oops;

import java.util.Scanner;

class x
{
	int a;
	int b;
	int c;
	public void display()
	{
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of a : ");
		int b = sc.nextInt();
		
		
//		System.out.println("Enter Value of A :" +a);
//		System.out.println("Enter Value of B :" +b);
			c = a + b ;
		
		
	}
}
class y extends x
{
	public void add()
	{
//		c = a + b ;
		System.out.println("Addition is :" + c);
	}
}
public class O002 {

	public static void main(String[] args) {

		y d = new y();
		d.add();
		
	}

}
