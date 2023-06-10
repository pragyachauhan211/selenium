package basicProgram;

public class pangram {
	
	public static void abc(String s)
	{
		
		boolean flag=true;
		s = s.toLowerCase();
		
		for(char ch = 'a'; ch <= 'z'; ch++)
		{
			if(!s.contains(String.valueOf(ch)))
			{
				flag=false;	
				 break;
			}
		}
			           
		 if(flag)
			 System.out.println("Yes");
		 else
			 System.out.println("No");
	}

	public static void main(String[] args) {
		//String s = "abcdefghijklmSGFGnopqrstuvwxyz";
		String s = "abc";
		abc(s);

	}

}
