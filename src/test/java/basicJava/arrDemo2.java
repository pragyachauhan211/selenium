package basicJava;

public class arrDemo2 {
	int roll_no;
	String name;
	
	arrDemo2(int roll_no, String name)
	{
	  this.roll_no = roll_no;
	  this.name = name;
	}

	public static void main(String[] args) {

		arrDemo2[] arr = new arrDemo2[5];
		arr[0] = new arrDemo2(1, "sdfsdf");
		arr[1] = new arrDemo2(2, "xcvxcv");
		arr[2] = new arrDemo2(3, "sdfsfg");
		arr[3] = new arrDemo2(4, "sgsgn");
		arr[4] = new arrDemo2(5, "sgsfg");
		  
		  for(int i = 0; i < arr.length; i++)
		  {
			  System.out.println(arr[i].roll_no+" "+arr[i].name);
		  }
		
		
		

	}

}
