package FileOutputInput;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A003FileReader {

	public static void main(String[] args) {

		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The File Name :");
		String s = sc.next();

		try 
		{
			fr = new FileReader("C:\\Users\\windows 10 pro\\OneDrive\\Documents\\Files\\"+s);
			int i = fr.read();

			while (i != -1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fr.read();
			}
		}
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			sc.close();
		}

	}

}
