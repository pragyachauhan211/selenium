package basicProgram;

public class countCharDemo1 {
	 String string = "The best ";   
	 int count = 0;   
	 
	public void count()
	{
 	  for(int i = 0;i<string.length();i++)	
	  {
		  if(string.charAt(i)!=' ')
		  
			  count++; 
		  
	  }
	  System.out.println(count);
	}

	public static void main(String[] args) {
		 
		countCharDemo1 cd = new countCharDemo1();
		cd.count();
	            
	      
	      
	}

}
