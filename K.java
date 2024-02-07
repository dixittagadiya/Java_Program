import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		
		int i,j;
		
		System.out.println("K patten");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No:");
		int a=sc.nextInt();
		
		for(i=a; i>=1; i--)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			for(j=i; j<=a; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(i=2; i<=a; i++)
		{
			for(j=1; j<=i; j++)
				
			{
				System.out.print("*");
			}
			for(j=a; j>=i; j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
