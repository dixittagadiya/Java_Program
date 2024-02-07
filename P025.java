package Program;

class Triangle
{
	int a;
	int b;
	int c;
	
	public Triangle()
	{
		this.a=3;
		this.b=4;
		this.c=5;
	}
	public void Area(int Base , int Hight)
	{
		System.out.println("Area of : "+(Base*Hight)/2);
	}
	public void Perameter()
	{
		System.out.println("perameter is : "+(a+b+c));
	}
}
public class P025 {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		t.Area(15, 2);
		t.Perameter();
		
	}
}
