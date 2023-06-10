package basicJava;

public class arrDemo1 {
	
	public void arr()
	{
		int[] arr;
		arr = new int[5];
		
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		arrDemo1 a = new arrDemo1();
		a.arr();

	}

}
