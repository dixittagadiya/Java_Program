package Hacker_program;

import java.util.Scanner;
public class Hecker001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No");
		int num = sc.nextInt();

		
		
		if (num % 2 !=0)
		{
			System.out.println(num+ "Weird");
		}
		else if(num>=2 && num<=5)
		{
			System.out.println(num+ "Not Weird");
		}
		else if (num>=6 && num<=20)
		{
			System.out.println(num+ "Weird");
		}
		else if (num>20)
		{
			System.out.println(num+ "Not Weird");
		}
		else
		{
			System.out.println(num+ "whether or not  is weird.");
		}
	}

}
