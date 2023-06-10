package basicJava;

import java.util.HashMap;
import java.util.Map;

public class hashmapDemo1 {
	
	@SuppressWarnings("rawtypes")
	public void hash() 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(123, "Pragya");
		map.put(456, "Riya");
		map.put(789, "Snehal");
		map.put(789, "Snehal");
		
		for(@SuppressWarnings("unused") Map.Entry m: map.entrySet());
		{
			System.out.println(map);
		}
		
	}

	public static void main(String[] args) 
	{
		hashmapDemo1 hm = new hashmapDemo1();
		hm.hash();
    }

}
