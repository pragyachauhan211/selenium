package basicProgram;
import java.util.Scanner;

public class oddEvenDemo {
	
	Scanner s = new Scanner(System.in);
	
	public void abc()
	{
		System.out.println("Enter a number");
		int num = s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("It is an even number");
		}
		else
		{
			System.out.println("It is an odd number");
		}
	}

	public static void main(String[] args) {
		oddEvenDemo oe = new oddEvenDemo();
		oe.abc();

	}

}
