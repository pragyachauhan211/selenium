package basicProgram;

public class armstrong {
	
public void cube()
{

int originalNumber = 371, number, remainder, result = 0;

number = originalNumber;
	
while (number != 0)
{
    remainder = number % 10;
    result = (int) (result+Math.pow(remainder, 3));
    number = number/ 10;  
}

if(result == originalNumber)
    System.out.println(originalNumber + " is an Armstrong number.");
else
    System.out.println(originalNumber + " is not an Armstrong number.");

	}

	public static void main(String[] args) {
		
		armstrong p = new armstrong();
		p.cube();

	}

}
