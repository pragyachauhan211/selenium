package triang;

public class triangleDemo20 {
	
	public void triangle()
	{int rows=8;  
	for (int i = 1; i <= rows; i++)   
	{  
	for (int j = 1; j <= rows-i; j++)  
	{  
	System.out.print(1);  
	}  
	for (int j = 1; j <= i; j++)  
	{  
	System.out.print(i);  
	}  
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo20 sp = new triangleDemo20();
		sp.triangle();

	}

}
