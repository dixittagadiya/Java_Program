import java.util.Scanner;

public class if_else {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Mark:");
		int mark = sc.nextInt();

		System.out.println("Enter Student Mark:");

		if (mark > 90 && mark <= 100) 
		{
			System.out.println("A Gread");	
		}
		else if (mark > 70 && mark <= 90) 
		{
			System.out.println("B Gread");
		}
		else if (mark > 40 && mark <= 70) 
		{
			System.out.println("C Great");
		}
		else 
		{
			System.out.println("Fail");
		}
		sc.close();

	}

}
