
public class piramind {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Piramind");
		
		for(i=5; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
