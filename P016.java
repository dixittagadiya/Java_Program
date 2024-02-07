package Program;

import java.util.Scanner;

public class P016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Sting :");
		String a = sc.nextLine();
		
		System.out.println("Enter The Second String :");
		String b = sc.nextLine();
		
		System.out.println(a.equals(b));
		
		sc.close();
	}
}
