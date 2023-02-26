package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile mbl = new Mobile();
		System.out.println("This is my mobile");
		mbl.makeCall();
		mbl.sendMsg();
	}

	public void makeCall(){
		String mobileModel = "Realme 9";
		float mobileWeight = 500;
		System.out.println("Mobile Model: "+mobileModel +" and Mobile Weight(gms): "+mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 20000;
		System.out.println("Is Full Charged: " +isFullCharged + " and Mobile Cost: " +mobileCost);
	}
}

