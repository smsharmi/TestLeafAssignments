package week3.day2.string;

public class Duplicate {

	public static void main(String[] args) {
		String str = "We learn JAVA Basics as part of java sessions in Java week1";
		int count = 0;
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					arr[j] = "";
					count += 1;
				}
			}
		}
		if (count > 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("No Duplicates in the given string " + str );
		}
	}

}
