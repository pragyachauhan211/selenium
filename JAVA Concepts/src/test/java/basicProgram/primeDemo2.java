package basicProgram;
import java.util.Scanner;

public class primeDemo2 { 
	
	Scanner s = new Scanner(System.in);
	
	public void count()
	{
	   	System.out.println("Enter any integer value");
	   	int num = s.nextInt();
	   	
	   	if(num<=1)
	   	{
	   		System.out.println("It is not a prime number");
	   	}
	   	
	   	else if(num==2)
	   	{
	   		System.out.println("It is a prime number");
	   	}
	   	
	   	else if(num%2==0)
	   	{
	   		System.out.println("It is not a prime number");
	   	}
	   	
	   		for(int i = 3; i<=Math.sqrt(num); i +=2)
	   		{
	   		 if(num%i==0)
	   		  {
	   			System.out.println("It is not a prime number");
	   			break;
	   		  }
	   		 else
	   		 
	   			System.out.println("It is a prime number");
	   		 
	   		 }  			   			   
	}

	public static void main(String[] args) 
	{
		primeDemo2 p = new primeDemo2();
		p.count();                                                
	}
}
