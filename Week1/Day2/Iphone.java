package week1.day2;

public class Iphone {

	int number = 7;

	public void sendMessage(int number, String name) {

		System.out.println(number + " " + name);
	}

	public static void main(String[] args) {
		// ClassName objectName=new ClassName();
		Iphone iphoneOptions = new Iphone();

		//System.out.println(iphoneOptions.number);

		iphoneOptions.sendMessage(7, "Vineeth");
		iphoneOptions.sendMessage(10, "Bharath");
	}

}
