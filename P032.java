package Program;

class Shap1
{
	public void shap()
	{
		System.out.println("This is shape..");
	}
}
class Rectangle extends Shap1
{
	public void rec()
	{
		System.out.println("This is rectangular shape..");
	}
}
class Circle extends Shap1
{
	public void cir()
	{
		System.out.println("This is circular shape..");
	}
}
class Square1 extends Rectangle
{
	public void squa()
	{
		System.out.println("Square is a rectangle..");
	}
}
public class P032 {

	public static void main(String[] args) {
		
		Square1 s = new Square1();
		s.shap();
		s.rec();
		s.squa();
		
		
	}
}
