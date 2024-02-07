package FileOutputInput;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class F002FileInputStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileInputStream fis = null;

		System.out.println("Enter The File Name :");
		String s = sc.next();

		try 
		{
			fis = new FileInputStream("C:\\Users\\windows 10 pro\\OneDrive\\Documents\\Files\\" + s);
			int i = fis.read();

			while (i != -1)
			{
				char ch = (char) i;
				System.out.print(ch);
				i = fis.read();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fis.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		sc.close();
	}

}
