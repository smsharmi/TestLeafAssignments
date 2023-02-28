package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 11;
		boolean flag =false;
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println("Number "+num+" is not Prime Number");
		}else {
			System.out.println("Number "+num+" is Prime Number");
		}
	}
}
