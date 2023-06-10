package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;

public class collectionPractice {
	
	public void abc()
	{
	HashMap<Integer, String> hp = new HashMap<Integer, String>();
	
	hp.put(12, "sfds");
	hp.put(125, "ssfdsdfds");
	hp.put(13452, "fg");
	hp.put(12234, "dfg");
	hp.put(14562, "sfsfgds");
	hp.put(12342, "dfg");
		
	Iterator i = hp.keySet().iterator();
	
	while(i.hasNext())
	{
		int e = (Integer) i.next();
		
		System.out.println(hp.get(e));
	}
	}

	public static void main(String[] args) { 
		collectionPractice a = new collectionPractice();
		a.abc();
	}

}
