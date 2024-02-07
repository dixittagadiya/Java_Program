package Program;

import java.util.Scanner;

public class P002_vowel_Consonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value :");
		char ch = sc.next().charAt(0);
		
		if(Character.isDigit(ch))
		{
			System.out.println("Digit..");
		}
		else
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch + " is vowel.");
			}
			else
			{
				System.out.println(ch + " is consonant.");
			}
		}
		sc.close();
		
	}

}
