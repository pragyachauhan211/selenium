package basicProgram;

public class palindrome2 {

	public boolean checkPalindrome()

	{
		String s1 = "madam";
		boolean isPalindrom = false;
		int j = (int) (s1.length() - 1) / 2;
		char a, b;

		for (int i = 0; i < j; i++)
		{
			a = s1.charAt(i);

			b = s1.charAt(s1.length() - 1 - i);

			if (a != b) {

				isPalindrom = false;

				break;
			}

			else {

				isPalindrom = true;

			}
		}

		return isPalindrom;
	}

	public static void main(String[] args) {

		palindrome2 po = new palindrome2();

		System.out.println(po.checkPalindrome());

	}

}
