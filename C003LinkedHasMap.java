package collection;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class C003LinkedHasMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(11, "Janak");
		map.put(22, "Sahil");
		map.put(33, "Dixit");
		map.put(44, "Mayank");
		map.put(55, "Arun");
		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}

}
