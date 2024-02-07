import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		int factorial =1 ,i;
		
		Scanner sc = new Scanner(System.in );
		
		System.out.println("Enter No:");
		int n= sc.nextInt();
		
		for(i =1; i<=n; i++)
		{
			factorial = factorial*i;
			
			System.out.println(factorial);
		}
	}
      
}
