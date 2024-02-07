import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		int i, j;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter No:");
		int a = s.nextInt();

		{
			for (i = 1; i <= a; i++)
			{
				for (j = 1; j <= i; j++) 
				{
					System.out.print(i);
				}
				System.out.print("\n");
			}
		}
	}

}
