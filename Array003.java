import java.util.Scanner;

public class Array003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		char ch[] = new char[size];
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("Enter value for index : "+i);
			ch[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
