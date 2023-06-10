package basicJava;

public class constructorDemo3 {
	private String n;
	private int id;
	
	public constructorDemo3()
	{
		this.n="Default name";
	}
	public constructorDemo3(String name)
	{
		this.n=name;
	}
	
	public constructorDemo3(String name, int i) {
		this.n = name;
		this.id = i;
	}
	
	//public String getName() {
	//	return n;
	//}
	
	//public int getId() {
	//	return id;
	//}

	@Override
	public String toString() {
		return "ID="+id+", Name="+n;
	}
	
	public static void main(String[] args) {
	//	sample s1 = new sample("Java it is");
		//System.out.println(s1);
		//System.out.println(s.display());
		//sample s2 = new sample();
		//System.out.println(s2);
		
		constructorDemo3 d = new constructorDemo3();
		System.out.println(d);
		
		d = new constructorDemo3("Java");
		System.out.println(d);
		
		
		
	}
}
