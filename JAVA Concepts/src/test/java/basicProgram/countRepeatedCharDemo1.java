package basicProgram;

public class countRepeatedCharDemo1 {
	int count;
	
	public void duplicate()
	{
		String s1 = "Pragya OPPAP PP";
		char[] c = s1.toCharArray();
		System.out.println("The duplicate characters are");
		for(int i = 0; i<s1.length();i++)
		{
			count =1;
			for(int j = i+1; j<s1.length(); j++)
			{
				if(c[i]==c[j]&&c[i]!=0)
				{
					count++;
					c[j]=0;
					
				}
			}
			
			    if(count > 1 && c[i] != '0')  
			    {
				 System.out.println(c[i]);  
			    }		
		}	
	}

	public static void main(String[] args) {
		countRepeatedCharDemo1 d = new countRepeatedCharDemo1();
		d.duplicate();
	}

}
