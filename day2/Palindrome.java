package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n = 234543;
		int num = n;
		int rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println("The given no. " + n + " is palindrome");
		}else {
			System.out.println("The given no. " + n + " is not palindrome");
		}
	}
}