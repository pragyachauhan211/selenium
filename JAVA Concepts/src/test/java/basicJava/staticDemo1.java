package basicJava;

public class staticDemo1 {
	int id;
	String name;
	static String college = "ABC";
	
	staticDemo1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void demo()
	{
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(college);
	}

	public static void main(String[] args) 
	{
		staticDemo1 sd = new staticDemo1(123, "Pragya");
		sd.demo();

	}

}
