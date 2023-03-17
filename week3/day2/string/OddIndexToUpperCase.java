package week3.day2.string;

import java.util.Arrays;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toCharArray();
		System.out.println(arr);
		
		for(int j = 0; j<test.length(); j = j+2) {
			if (j % 2 == 0) {
				arr[j] = Character.toUpperCase(arr[j]);
			}
		}
		System.out.println("test::" + Arrays.toString(arr));
	}
}
