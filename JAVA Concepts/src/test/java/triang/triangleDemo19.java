package triang;

public class triangleDemo19 {
	
	public void triangle()
	{int rows=7, i, j;  
	for (i = rows; i >= 1; i--)   
	{  
	for (j = i; j >= 1; j--)  
	{  
	System.out.print(j+" ");  
	}  
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo19 sp = new triangleDemo19();
		sp.triangle();

	}

}
