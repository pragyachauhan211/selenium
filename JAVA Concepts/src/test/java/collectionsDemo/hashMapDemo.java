package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class hashMapDemo {

	HashMap<Integer, String> hList = new HashMap<Integer, String>();
	
	public void sort()
	{
		hList.put(3, "Pragya");
		hList.put(9, "ADFG");
		hList.put(2, "wdfg");
		
		Iterator i = hList.keySet().iterator();
		
		while(i.hasNext())
		{
			int key = (Integer) i.next();
			System.out.println(key+" "+hList.get(key));
		}
		
		System.out.println("---------------");
		
		TreeMap<Integer, String> tList = new TreeMap<Integer, String>(hList);
		Iterator i2 = tList.keySet().iterator();
		
		while(i2.hasNext())
		{
			int key = (Integer) i2.next();
			System.out.println(key+" "+tList.get(key));
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapDemo h = new hashMapDemo();
		h.sort();

	}

}
