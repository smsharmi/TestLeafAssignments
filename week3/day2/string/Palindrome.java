package week3.day2.string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam", rev = "";
		System.out.println("The String is " + str);
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("The given string is Palindrome ");
		} else {
			System.out.println("The given string is not Palindrome");
		}
	}
}