package basicProgram;

import java.util.Arrays;

public class anagram {

	public static boolean abc(String s1, String s2) {
		String s11 = s1;
		String s22 = s2;

		char[] c1 = s11.toCharArray();
		char[] c2 = s22.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) 
		{
			System.out.println("It is anagram");
			return true;
		}

		System.out.println("It is not a anagram");
		return false;

	}

	public static void main(String[] args) {

		abc("abc", "abc");

	}

}
