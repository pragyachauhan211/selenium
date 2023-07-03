package triang;

public class triangleDemo18 {
	
	public void triangle()
	{int i, j, rows=9;  
	for (i = rows; i >= 1; i--)   
	{  
	for (j = 1; j <= i; j++)  
	{  
	System.out.print(j+" ");  
	}  
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo18 sp = new triangleDemo18();
		sp.triangle();

	}

}
