package triang;

import java.util.Scanner;

public class triangleDemo16 {
	
	public void triangle()
	{int i, j, rows;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number of rows youy want to print: ");  
	rows = sc.nextInt();  
	for (i = rows; i >= 1; i--)  
	{  
	for (j = rows; j >= i; j--)  
	{  
	System.out.print(j+" ");  
	}  
	   
	System.out.println();  
	}  
	}   

	public static void main(String[] args) {
		triangleDemo16 sp = new triangleDemo16();
		sp.triangle();

	}

}
