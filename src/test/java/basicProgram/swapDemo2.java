package basicProgram;
import java.util.Scanner;

public class swapDemo2 {
	
int c;
Scanner s = new Scanner(System.in);

public void demo()
{
	System.out.println("Enter first value ");
	int a = s.nextInt();
	System.out.println("Enter first value ");
	int b = s.nextInt();
	c=a+b;
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("after swapping value of a is "+a);
	System.out.println("after swapping value of b is "+b);
	System.out.println();
}
	

	public static void main(String[] args) {
		swapDemo2 sp = new swapDemo2();
		sp.demo();

	}

}
