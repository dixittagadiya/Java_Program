package Program;


class Print
{
	public void Print(int a)
	{
		System.out.println(a);
	}
	public void print(float a)
	{
		System.out.println(a);
	}
	public void print(double a)
	{
		System.out.println(a);
	}
	public void print(String a)
	{
		System.out.println(a);
	}
}
public class P019 {

	public static void main(String[] args) {
		
		Print p = new Print();
		
		p.Print(10);
		p.print(10.9f);
		p.print(213.09);
		p.print("Dixit");
		
	}
}