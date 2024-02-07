package collection;

import java.util.TreeSet;

public class C002TreeSet {

	public static void main(String[] args) {

		TreeSet<String> Tree = new TreeSet<String>();
		Tree.add("Sahil");
		Tree.add("Mayank");
		Tree.add("Dixit");
		Tree.add("Janak");
		Tree.add("Arun");
		
		for(String t:Tree)
		{
			System.out.println(t);
		}
	}

}
