package basicProgram;
import java.util.Scanner;

public class swapDemo1 {
	
	int c;
	
	Scanner s = new Scanner(System.in);
	
	public void demo()
	{
		System.out.println("Enter first value ");
		int a = s.nextInt();
		System.out.println("Enter second value ");
		int b = s.nextInt();
		
		a = a+b;// 2+3 = 5
		b=a-b;// 5-3=2(b)
		a=a-b;// 5-2=3(a)
		System.out.println("after swapping value of a is "+a);
		System.out.println("after swapping value of b is "+b);
	}

	public static void main(String[] args) 
	{
		
		swapDemo1 sp = new swapDemo1();
		sp.demo();
	} 

}
