import java.util.Scanner;

public class ScanerDemo {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		
		System.out.println("Your Name is "+name+" \nYour 1 ID is "+a+" \n2 ID is "+b+" ");
		
		
		
	}
}
