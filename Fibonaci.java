import java.util.Scanner;
public class Fibonaci {

	public static void main(String[] args) {
		
		int a=0,b=1,c,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No:");
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;			
		}

	}

}
