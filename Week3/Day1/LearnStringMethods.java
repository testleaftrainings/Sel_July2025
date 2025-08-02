package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		String batchName = "SeleniumJuly";
		String[] split = batchName.split("u");
		System.out.println(split[0]);

		// subString - 1 String converted into another String
		String substring = batchName.substring(3);
		System.out.println(substring);

		String substring2 = batchName.substring(3, 6);
		System.out.println(substring2);

		// replaceAll and parseInt
		int amount = 1000;
		String rupee = "25,000Rupees";
		System.out.println(amount + rupee);

		// replaceAll
		String replaceAll = rupee.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);

		// parseInt
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt + amount);

	}

}
