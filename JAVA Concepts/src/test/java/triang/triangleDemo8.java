package triang;

public class triangleDemo8 {
	
	public void triangle()
	{
		int n=7;  
		//inner loop  
		for (int i= 0; i<= n; i++)  
		{  
		//outer loop  
		for (int j=1; j<=n-i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0;k<=i;k++)  
		{  
		System.out.print("*");  
		}   
		System.out.println("");  
		}  
	}   

	public static void main(String[] args) {
		triangleDemo8 sp = new triangleDemo8();
		sp.triangle();

	}

}
