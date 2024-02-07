package Program;

class Area
{
	public void area(int i)
	{
		System.out.println("Area of Square : "+i*i);
	}
	public void area(int l ,int b)
	{
		System.out.println("Area of Square : "+l*b);
	}
}
public class P021 {

	public static void main(String[] args) {
		
		Area a = new Area();
		
		a.area(20);
		a.area(20, 30);
		
		
	}
}
