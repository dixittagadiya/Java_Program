package collection;

import java.util.LinkedHashSet;

public class C001LinkedHasSet {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("SQL");
		set.add("Selenium");
		set.add("Java");
		
		for(String e:set)
		{
			System.out.println(e);
		}
		
	}

}
