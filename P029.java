package Program;

import java.util.Scanner;

class Factorial
{
	int fact=1;
	
	public void fac(int num)
	{
		for(int i=1; i<=num; i++)
			
			fact = fact * i;
		
			System.out.println("The Factorial is : "+fact);
	}
}
public class P029 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No : ");
		int num = sc.nextInt();
		
		Factorial f = new Factorial();
		f.fac(num);
	}
}