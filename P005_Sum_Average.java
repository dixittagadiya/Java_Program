package Program;

import java.util.Scanner;

public class P005_Sum_Average {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The 1 No :");
		int a=sc.nextInt();
		System.out.println("Enter The 2 No :");
		int b=sc.nextInt();
		System.out.println("Enter The 3 No :");
		int c=sc.nextInt();
		System.out.println("Enter The 4 No :");
		int d=sc.nextInt();
		System.out.println("Enter The 5 No :");
		int e=sc.nextInt();
		
		int Sum = a+b+c+d+e;
		
		System.out.println("Sum of :"+Sum);
		
		double Ave = Sum/5;
		
		System.out.println("Avrege of :"+Ave);
		sc.close();
	}

}
