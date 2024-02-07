package Program;

import java.util.Scanner;

public class P001_GreatestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value of A :");
		int a=sc.nextInt();
		
		System.out.println("Enter The Value of B :");
		int b =sc.nextInt();
		
		System.out.println("Enter The Value of C :");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is Greatest..");
		}
		else if(b>c)
		{
			System.out.println("B is Greatest..");
		}
		else
		{
			System.out.println("C is Greatest..");
		}
		sc.close();
	}

}
