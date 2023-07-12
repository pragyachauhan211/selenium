package basicProgram;


public class leapYear1 {
	
	public static boolean year(int year)
	{		
		if(year%4==0)
		{
			if(year%100!=0)
			{
				if(year%400==0)
				{
					return true;
				}
			
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		if(year(600))
		System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
		
	}

}
