package basicProgram;

public class sumOfIntegerInString {
	
	String s1 = "sdgfs245fgdfg";
	
	public void sumInt()
	{
		s1 = s1.replaceAll("[^0-9]", " "); 
	        
	        char[] c = s1.toCharArray();
	        int sum = 0;
	        for (int i = 0; i < c.length; i++) {
	            if (Character.isDigit(c[i])) {
	                System.out.print("Digits in the String : " + c[i]);
	                System.out.println();
	                int a = Integer.parseInt(String.valueOf(c[i]));
	                sum = sum + a;
	            }
	        }
	        System.out.println("Sum of Digits is : " + sum);

	}

	public static void main(String[] args) {
		sumOfIntegerInString sum = new sumOfIntegerInString();
		sum.sumInt();
		

	}

}
