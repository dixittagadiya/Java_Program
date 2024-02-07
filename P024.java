package Program;

class Rectengle
{
	double length;
	double breadth;
	
	public Rectengle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void rectengle()
	{
		System.out.println("Area of Square : "+length*breadth);
	}
	public void Rec()
	{
		System.out.println("Area of Square : "+2*(length+breadth));
	}
}
class Square extends Rectengle
{
	public Square(double side)
	{
		super(side,side);
	}
	public void sq(double side)
	{
		System.out.println(side*4);
	}
}
public class P024 {

	public static void main(String[] args) {
		
		Rectengle r = new Rectengle(20,20);
		r.rectengle();
		r.Rec();
		
		Square s = new Square(5);
		s.sq(5);
		
		
	}
}
