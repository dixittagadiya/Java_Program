import java.util.Scanner;

public class Arme_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The String - 1 :");
		String a = sc.next();

		System.out.println("Enter The String - 2 :");
		String b = sc.next();

		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();

		for (int i = 0; i < a.length(); i++) {
			System.out.print(c1[i]);
		}
		
		
		System.out.println();

		

		for (int i = 0; i < b.length(); i++) {
			System.out.print(c2[i]);
		}
		System.out.println();

		for (int i = 0; i < a.length(); i++) {
			char temp = 0;
			for (int j = i + 1; j < a.length(); j++) {
				if (c1[j] < c1[i]) {
					
					temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
			System.out.print(c1[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < b.length(); i++) {
			char temp = 0;
			for (int j = i + 1; j < b.length(); j++) {
				if (c2[j] < c2[i]) {
					
					temp = c2[i];
					c2[i] = c2[j];
					c2[j] = temp;
				}
			}
			System.out.print(c2[i]);
		}
		System.out.println();
		
		int f=0;
		
		for(int i=0; i<c1.length; i++)
		{
			if(c1[i]!=c2[i])
			{
				f=1;
			}
		}
		
		System.out.println();
		
		if(f==0)
		{
			System.out.println("Arme String..");
		}
		else
		{
			System.out.println("Not Arme String..");
		}

	}

}