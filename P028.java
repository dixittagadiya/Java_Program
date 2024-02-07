package Program;

abstract class Marks
{
	public abstract void getPercentage(); 
}
class StudentA extends Marks
{
	double a,b,c;
	
	StudentA(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void getPercentage()
	{
		System.out.println("StudentA Mark is : "+(a+b+c)/3);
	}
}
class StudentB extends Marks
{
	double a,b,c,d;
	
	StudentB(double a, double b, double c, double d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void getPercentage()
	{
		System.out.println("StudentB Mark is : "+(a+b+c+d)/4);
	}
}

public class P028 {

	public static void main(String[] args) {
		
		StudentA s1 = new StudentA(90, 80, 95);
		s1.getPercentage();
		
		StudentB s2 = new StudentB(80, 85, 90, 95);
		s2.getPercentage();
	}
}
