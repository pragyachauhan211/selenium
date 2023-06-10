package basicProgram;
import java.util.StringTokenizer;

public class countWordsDemo2 {
	
	String Full_name;
	
	public static int demo2(String Full_name)
	{
		if(Full_name==null || Full_name.isEmpty())
	    return 0;
        
		StringTokenizer tokens = new StringTokenizer(Full_name);
		return tokens.countTokens();
	}

	public static void main(String[] args) {
				
		String Full_name = "My name is Mr. vbdgAnthony";
		System.out.println(demo2(Full_name));
		
	}
}
