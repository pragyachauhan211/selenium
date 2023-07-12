package triang;

public class triangleDemo9 {
	
	public void triangle()
	{
	int rows=8;  
	for (int i= 0; i<= rows-1; i++)  
	{  
	for (int j=0; j<=i; j++)  
	{  
	System.out.print("");  
	}  
	for (int k=0; k<=rows-1-i; k++)  
	{  
	System.out.print("*" + " ");  
	}  
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo9 sp = new triangleDemo9();
		sp.triangle();

	}

}
