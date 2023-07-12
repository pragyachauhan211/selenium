package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo {
	
	List<String> list = new ArrayList<String>();
	Iterator<String> i = list.iterator();
	
	public void sort()
	{
		list.add("Pragya");
		list.add("Rehana");
		list.add("Akanksha");
		list.add("Sunita");
		list.add("Rekha");
		
		for(String e : list)
		{
			System.out.println(e);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		arrayListDemo a = new arrayListDemo();
		a.sort();

	}

}
