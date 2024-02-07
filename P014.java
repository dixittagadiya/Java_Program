package Program;

import java.util.Scanner;

public class P014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String :");
		String c = sc.nextLine();
		
		System.out.println(c.charAt(0));
		
		System.out.println(c.charAt(10));
		
		sc.close();
		
	}
}
