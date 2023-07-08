package basicJava;

public class constructorDemo4 {

	private int id;
	private String name;
	
	public constructorDemo4() {
		this("John Doe", 999);
		System.out.println("Default Employee Created");
	}
	
	public constructorDemo4(int i) {
		this("John Doe", i);
		System.out.println("Employee Created with Default Name");
	}
	public constructorDemo4(String s, int i) {
		this.id = i;
		this.name = s;
		System.out.println("Employee Created");
	}
	public static void main(String[] args) 
	{
		constructorDemo4 emp = new constructorDemo4();
		System.out.println(emp);
		constructorDemo4 emp1 = new constructorDemo4(10);
		System.out.println(emp1);
		constructorDemo4 emp2 = new constructorDemo4("Pankaj", 20);
		System.out.println(emp2);
	}

	@Override
	public String toString() {
		return "ID = "+id+", Name = "+name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}