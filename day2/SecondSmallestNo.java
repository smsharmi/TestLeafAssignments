package week1.day2;

import java.util.Arrays;

public class SecondSmallestNo {

	public static void main(String[] args) {
		int a1[] = { 23, 45, 67, 32, 89, 22 };
		Arrays.sort(a1);
		System.out.println("Second Smallest no.: " + a1[1]);
	}
}
