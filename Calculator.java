import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int c;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose 1 to 5 No : ");
		int operator=sc.nextInt();
		

		System.out.println("Enter The Value Of A:");
		int a = sc.nextInt();

		System.out.println("Enter The Value of B:");
		int b = sc.nextInt();

		switch (operator) {
		case 1:

			c = a + b; 
			System.out.println("Addition\n" + c);
		
			break;

		case 2:

			c = a - b; 
			System.out.println("Substraction\n" + c);
		
			break;

		case 3:

			c = a * b; 
			System.out.println("Multiplication\n" + c);
		
			break;

		case 4:

			c = a / b; 
			System.out.println("Division\n" + c);
		
			break;

		case 5:

			c = a % b; 
			System.out.println("Moduls\n" + c);
	
			break;

		default: 
			System.out.println("Invalid No..");
		
		}
	}

}
