package Program;

import java.util.Scanner;

public class P015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First String :");
		String a = sc.nextLine();
		
		System.out.println("Enter The Second String :");
		String b = sc.nextLine();
		
		String c = a + b;
		
		System.out.println(c);
		
		sc.close();
	}
}
