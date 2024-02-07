package Program;

abstract class Shap
{
	public abstract void RectangleArea(double length , double breadth);
	public abstract void SquareArea(double side);
	public abstract void CircleArea(double radius);
}

class Area1 extends Shap
{
	@Override
	public void RectangleArea(double length , double breadth)
	{
		System.out.println("Area Of Reactangle is : "+length*breadth);
	}

	@Override
	public void SquareArea(double side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is : "+side*side);
	}

	@Override
	public void CircleArea(double radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is : "+radius*3.14);
	}
}
public class P030 {

	public static void main(String[] args) {
		
		Area1 a = new Area1();
		
		a.RectangleArea(20, 20);
		a.SquareArea(10);
		a.CircleArea(30);
	}
}
