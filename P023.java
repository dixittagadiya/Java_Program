package Program;

class Member
{
	int id = 10;
	String name = "Dixit";
	int age = 18;
	long ph = 9923023456l;
	String add = "Surat";
	double Sallary = 800000;
	
	public void printSallary()
	{
		System.out.println("Sallary is : "+Sallary);
	}
}

public class P023 {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.printSallary();
	
	}
}
