package basicProgram;
import java.util.Scanner;

public class Factorial {
	
	static Scanner s = new Scanner(System.in);
	static int lenth;	
	
	public int fact(int length)
	{
		System.out.println("Enter length");
		length = s.nextInt();
		int c = 1;
		
		for(int i =1; i<=length;i++)
		{  
			c = c*i;	
		}
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		f.fact(lenth);

	}

}
