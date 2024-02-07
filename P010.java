package Program;

import java.util.Scanner;

public class P010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No :");
		char a = sc.next().charAt(0);
		
		System.out.println("Show The ASCII Value : "+(int) a);
		
		sc.close();
	}
}
