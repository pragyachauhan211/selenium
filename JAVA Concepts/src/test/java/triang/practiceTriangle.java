package triang;

// 1, 5, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19
public class practiceTriangle {
	
	public void triangle()
	{
		int row =5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row-i; j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=row; i>=1; i--)
		{
			for(int j=i; j<=row;j++)
			{
				System.out.print("!");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) 
	{
		practiceTriangle pt = new practiceTriangle();
		pt.triangle();

	}
}