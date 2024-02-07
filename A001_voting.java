package exeption;

import java.util.Scanner;

import javax.security.sasl.SaslException;

class voting
{

	int age;
	public void age(int age) throws A002ageNotValid
	{
		
		if(age<18)
		{
			int AgeChake = 18 - age;
			throw new A002ageNotValid(AgeChake);
		}
		else
		{
			System.out.println("your Eligible to vot ");
		}
	}
}

public class A001_voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		voting v = new voting();
		try 
		{
			v.age(age);
		} 
		catch (A002ageNotValid e) 
		{

			e.printStackTrace();
			e.getmessage();
		}
		
	}

}
