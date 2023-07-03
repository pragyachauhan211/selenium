package basicJava;

public class throwsDemo1 {
	
	static void  check(int age) throws ArithmeticException
	{
		if(age > 18)
		{
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else
		{
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		throwsDemo1.check(21);

	}

}
