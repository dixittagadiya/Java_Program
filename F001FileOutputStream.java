package FileOutputInput;
import java.util.Scanner;
import java.io.FileOutputStream;

public class F001FileOutputStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FileOutputStream fos = null;
		try 
		{
			System.out.println("Enter The Name :");
			String s1 = sc.next();
			
			System.out.println("Enter The E-Mail :");
			String s = sc.next();

			fos = new FileOutputStream("C:\\Users\\windows 10 pro\\OneDrive\\Documents\\Files\\" + s1);

			byte[] b = s.getBytes();
			fos.write(b);
			System.out.println("Your File Created Succesfully.");
		}

		catch (Exception e)

		{
			e.printStackTrace();
		}
		sc.close();
	}

}