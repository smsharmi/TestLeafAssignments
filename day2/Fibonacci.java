package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("The Fibonacci series for the given range is :");
		int range = 5;
		int n1 = 0, n2 = 1, n3;
		for (int n = 1; n <= range; n++) {
			System.out.println(n1);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
