package basicJava;

public class practiceDemo1 {
	int roll_no;
	String name;
	
	practiceDemo1(int roll_no, String name )
	{
	  this.roll_no = roll_no;
	  this.name = name;
	}

	public static void main(String[] args) 
	{
		practiceDemo1[] arr = new practiceDemo1[5];
		arr[0] = new practiceDemo1(1, "sfgfg");
		arr[1] = new practiceDemo1(2, "sfgfg");
		arr[2] = new practiceDemo1(3, "sfgfg");
		arr[3] = new practiceDemo1(4, "sfgfg");
		arr[4] = new practiceDemo1(5, "sfgfg");
		arr[4] = new practiceDemo1(6, "sfgfg");
		arr[4] = new practiceDemo1(7, "sfgfg");
		
		for(int i = 0; i<arr.length; i++)
		{
		System.out.println(arr[i].roll_no+" "+arr[i].name);
		}

	}

}
