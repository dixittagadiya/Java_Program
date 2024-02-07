package Program;

import java.util.Scanner;

class Mark
{
	public void mark(int s1, int s2, int s3, int s4,int s5)
	{
		int sum = s1+s2+s3+s4+s5;
		
		double av = sum*100/500;
		
		System.out.println("Persentage of : "+av);
		
		if(av >= 91 && av <= 100)
		{
			System.out.println("A Grade");
		}
		else if (av >= 81 && av <= 90)
		{
			System.out.println("B Grade");
		}
		else if (av >= 71 && av <= 80)
		{
			System.out.println("B Grade");
		}
		else if (av >= 61 && av <= 70)
		{
			System.out.println("C Grade");
		}
		else if (av >= 51 && av <= 60)
		{
			System.out.println("D Grade");
		}
		else if (av >= 41 && av <= 50)
		{
			System.out.println("DD Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
public class P031 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Marks of Subject 1 :");
		int s1 = sc.nextInt();
		System.out.println("Enter The Marks of Subject 2 :");
		int s2 = sc.nextInt();
		System.out.println("Enter The Marks of Subject 3 :");
		int s3 = sc.nextInt();
		System.out.println("Enter The Marks of Subject 4 :");
		int s4 = sc.nextInt();
		System.out.println("Enter The Marks of Subject 5 :");
		int s5 = sc.nextInt();
		
		Mark m = new Mark();
		m.mark(s1, s2, s3, s4, s5);
	}
}
