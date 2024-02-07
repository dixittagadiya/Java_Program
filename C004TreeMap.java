package collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class C004TreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "Amreli");
		map.put(20, "Surat");
		map.put(30, "Ahemdabad");
		map.put(40, "Rajkot");
		map.put(50, "Vadodra");
		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
		}
		
	}

}
