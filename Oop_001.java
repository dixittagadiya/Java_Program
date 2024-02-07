class car
{
	int price;
	static String company;

	public void toWrite()
	{
		System.out.println(price+" "+company);

	}

}


public class Oop_001 {

	public static void main(String[] args)
	{
		car c1 = new car();
		
	    c1.company="Tata";
	    c1.price=600000;
	    c1.toWrite();
	}
	
}
