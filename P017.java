package Program;

import java.util.Scanner;

public class P017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First String :");
		String a = sc.nextLine();
		
		System.out.println(a.endsWith("se"));
		
		System.out.println("Enter The Second String :");
		String b = sc.nextLine();
		
		System.out.println(b.endsWith("se"));
		
		sc.close();
	}
}