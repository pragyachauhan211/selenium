package triang;

public class triangleDemo10 {
	
	public void triangle()
	{int row=7;  
	for (int i= row; i>= 1; i--)  
	{  
	for (int j=row; j>i;j--)  
	{  
	System.out.print(" ");  
	}  
	for (int k=1;k<=i;k++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo10 sp = new triangleDemo10();
		sp.triangle();

	}

}
