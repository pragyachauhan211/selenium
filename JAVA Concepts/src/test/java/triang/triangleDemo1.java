package triang;

public class triangleDemo1
{
	int row;
	
	public void triangle()
	{   
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row=6;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   

	public static void main(String[] args) {
		triangleDemo1 sp = new triangleDemo1();
		sp.triangle();

	}

}

