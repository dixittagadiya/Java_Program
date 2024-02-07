public class Star_pattern1 {

	public static void main(String[] args) {

		int i,j;
		
		System.out.println("Star Patter 1");
		
		{
			for(i=1; i<=5; i++)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				for(j=i; j<=5; j++)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			
			for(i=5+1; i>=1; i--)
			{
				for(j=i; j>=1; j--)
				{
					System.out.print("* ");
				}
				for(j=5; j>=i; j--)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
