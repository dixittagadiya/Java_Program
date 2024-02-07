package Program;

import java.util.Scanner;

public class P018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First String :");
		String a = sc.nextLine();
		
		System.out.println(a.startsWith("Red"));
		
		System.out.println("Enter The Second String :");
		String b = sc.nextLine();
		
		System.out.println(b.startsWith("Red"));
	
		sc.close();
	}
}
