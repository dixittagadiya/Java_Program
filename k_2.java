import java.util.Scanner;
public class k_2 {
	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No:");
		int a= sc.nextInt();
		
		for(i=1; i<=a; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(j=i; j<=a; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=a-1; i>=1; i--)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(j=a; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

}
