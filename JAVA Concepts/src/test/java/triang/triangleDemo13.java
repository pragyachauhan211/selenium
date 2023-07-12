package triang;

public class triangleDemo13 {
	
	public void triangle()
	{int i, j, n=7;  
	
	//loop for rows  
	for(i=0; i<n; i++)  
	{   
	int number=1;  
	//loop for columns  
	for(j=0; j<=i; j++)  
	{   
	
	System.out.print(number+ " ");   
	//incrementing the value of number   
	number++;   
	}   
	//throws the cursor at the next line after printing each row  
	System.out.println();   
	}   
	}   

	public static void main(String[] args) {
		triangleDemo13 sp = new triangleDemo13();
		sp.triangle();

	}

}
