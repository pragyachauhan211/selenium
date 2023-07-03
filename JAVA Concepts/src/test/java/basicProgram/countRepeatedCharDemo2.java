package basicProgram;

public class countRepeatedCharDemo2 {
	public void duplicate()
	{
		int counter=0;
		String s = "sfsf ";
		s = s.toLowerCase();
	    s = s.replaceAll(" ", "");
	    
		while(s.length()>0)
		{
		for(int i = 0; i<s.length();i++)
		{
		 if(s.charAt(0)==s.charAt(i))
		 {
			 counter++;
		 }
		}
		
		System.out.println(s.charAt(0)+" count is "+counter);
		String t = String.valueOf(s.charAt(0)).trim();	
		s = s.replaceAll(t, "");
		counter = 0;
		}
	}

	public static void main(String[] args) 
	{
		countRepeatedCharDemo2 d1 = new countRepeatedCharDemo2();
		d1.duplicate();

	}

}
