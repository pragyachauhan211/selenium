package triang;

public class triangleDemo4 {
	
	 int rows = 6;
	 public void triangle()
	 {
	    for(int i = rows; i >= 1; --i) {
	      for(int space = 1; space <= rows - i; ++space)
	      {
	        System.out.print("  ");
	      }

	      for(int j=i; j <= 2 *  i - 1; ++j) 
	      {
	        System.out.print("* ");
	      }

	      for(int j = 0; j < i - 1; ++j) 
	      {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	 }

	public static void main(String[] args) {
		triangleDemo4 sp = new triangleDemo4();
		sp.triangle();

	}

}
