package triang;

public class triangleDemo2 {
	
	public void triangle()
	{   
		 
		 for(int i = 5; i >=1; i--)
		    {
			 for(int j =i; j >=1; j--)
		      {
		       System.out.print("* ");
		      }
		      System.out.println();
		    }
	}   

	public static void main(String[] args) 
	{
		triangleDemo2 sp = new triangleDemo2();
		sp.triangle();

	}

}
