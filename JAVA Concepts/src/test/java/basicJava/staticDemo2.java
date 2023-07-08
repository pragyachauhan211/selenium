package basicJava;

public class staticDemo2 {
	static int counter = 0;
	
	staticDemo2()
	{
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {
		
		new staticDemo2();
		new staticDemo2();
		new staticDemo2();
		

	}

}
