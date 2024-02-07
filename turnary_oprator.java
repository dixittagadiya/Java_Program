
public class turnary_oprator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		String result = a>c && a>b ? "a is greater" : b>c ? "b is greater" : "c is greater";
		
		System.out.println(result);
			 
	}

}