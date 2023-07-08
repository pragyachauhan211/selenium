package basicProgram;

public class reverseDemo1 {
	
	String str = "Pragya", str1="";
	char ch;
	
	
	public void reverseString()
	{
		for(int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			str1 = ch+str1;
		}
		System.out.println(str1);
		
	}

	public static void main(String[] args) {
		reverseDemo1 r = new reverseDemo1();
		r.reverseString();

	}

}
