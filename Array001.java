package Array;

import java.util.Scanner;

public class Array001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Row :");
		int row = sc.nextInt();
		
		System.out.println("Enter Number of Colum :");
		int colum = sc.nextInt();
		
		int a[][] = new int[row][colum];
		int b[][] = new int[row][colum];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colum; j++)
			{
				System.out.println("Enter Value of A :");
				a[i][j]=sc.nextInt();
				System.out.println("Enter Value of B :");
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colum; j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colum; j++)
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colum; j++)
			{
				System.out.print(a[i][j]+b[i][j] +" ");
			}
			System.out.println();
		}
	}

}
