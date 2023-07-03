package basicProgram;

public class reverseDemo2 {
	String p = "Pragya is very Good";
	
	public void demo2()
	{
		StringBuilder s = new StringBuilder(p);
	    System.out.println(" "+s.reverse());
		
	}

	public static void main(String[] args) {
		reverseDemo2 rd = new reverseDemo2();
		rd.demo2();

	}

}
