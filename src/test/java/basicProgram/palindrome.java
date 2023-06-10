package basicProgram;

public class palindrome {
	
	String s = "madam";
	String s2 = " ";
	
	public void abc()
	{
		for(int i=0; i<s.length(); i++)
		{
			s2 = s2+s.charAt(i);
		}
		System.out.println(s2);
		
		if(s.equals(s2))
		{
			System.out.println("It is palindrome");
		}	
		else
		{
			System.out.println("It is not palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome p = new palindrome();
		p.abc();

	}

}
