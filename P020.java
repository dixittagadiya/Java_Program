package Program;

class print1
{
	public print1(int n, char c)
	{
		System.out.println("The Number is : "+n+" The Charactor is : "+c);
	}
	public print1(char c, int n)
	{
		System.out.println("The Charactor is : "+c+" The Number is : "+n);
	}
}
public class P020 {

	public static void main(String[] args) {
		
		print1 p =new print1(10, 'A');
		print1 c =new print1('B', 20);
		
		
		
	}
}
