package collection;

import java.util.ArrayList;

public class C005ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(2);
		a.add(2);
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}