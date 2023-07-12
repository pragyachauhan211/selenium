package basicProgram;
import java.util.Scanner;
public class fibonacciDemo1 {
		int a= 0;
		int b= 1;
		int c;
		int counter;
		
	Scanner s = new Scanner(System.in);
	
	public void fibo()
	{
		System.out.println("Enter a value");
		counter = s.nextInt();
		for(int i=1; i<=counter;i++)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.println(i+" is "+c);
		}
		
	}

	public static void main(String[] args) {
		fibonacciDemo1 f = new fibonacciDemo1();
		f.fibo();

	}

}
