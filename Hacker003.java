package Hacker_program;

import java.util.Scanner;

public class Hacker003 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter The Value :");
		int num =sc.nextInt();
		
		for(int i=1 ; i<=10; i++)
		{
			System.out.println(num+" x "+i+" = "+ num*i);
		}
	}

}