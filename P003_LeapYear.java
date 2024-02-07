package Program;

import java.util.Scanner;

public class P003_LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Years :");
		int a=sc.nextInt();
		
		if(a % 4 == 0)
		{
			System.out.println("Leap Years..");
		}
		else
		{
			System.out.println("Not Leap Years..");
		}
		
		sc.close();
	}

}
