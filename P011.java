package Program;

import java.util.Scanner;

public class P011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No :");
		int n= sc.nextInt();
		
		System.out.println(n+" + "+(n*10+n)+" + "+(n*100+n*10+n));
		
		// 5+55+555
		sc.close();
		
	}
}
