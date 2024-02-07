import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose 1 to 3 No:");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Gujarat");
			break;
		case 2:
			System.out.println("Rajsthan");
			break;
		case 3:
			System.out.println("Maharastra");
			break;
		default :
			System.out.println("Invalid No:");
		}
		
	}

}
