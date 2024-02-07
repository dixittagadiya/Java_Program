
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Two Number Sum");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter No 1:");
			int a = sc.nextInt();
			
			System.out.println("Enter No 2:");
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("Two Number Sum Of:");
			System.out.println(sum);
		}
		
	}

}