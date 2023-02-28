package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int n = 56, num = n;
		if (num > 0) {
			System.out.println("The no. " + n + " is already a positive no. ");
		} else {
			num = -1 * num;
			System.out.println("The no. " + n + " is converted to " + num);
		}
	}
}