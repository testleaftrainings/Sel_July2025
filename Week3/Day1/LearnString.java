package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		// String Literal
		String str1 = "TestLeaf";

		String str3 = "TestLeaf";

		// String Instantiation
		String str2 = new String("TestLeaf");

		String str4 = new String("TestLeaf");

		// .equals - Compares the values of 2 Strings
		// == - Compares the reference address of 2 Strings

		// .equals
		System.out.println(str1.equals(str2));

		// ==
		System.out.println(str1 == str3);
		System.out.println(str1 == str2);
		System.out.println(str2 == str4);

		System.out.println("------------");

		String batchName = "Selenium July";

		// To get the length of the String
		int lengthOfString = batchName.length();
		System.out.println("The length is: " + lengthOfString);

		// contains - partial value of 2 Strings
		boolean contains = batchName.contains("July");
		System.out.println(contains);

		// equalsIgnoreCase
		boolean equalsIgnoreCase = batchName.equalsIgnoreCase("SELENIUM JULY");
		System.out.println(equalsIgnoreCase);

		String batch = "Selenium";

		// toUpperCase - convert the String into upperCase
		String upperCase = batch.toUpperCase();
		System.out.println(upperCase);

		// toCharArray - Convert a String into Character Array
		char[] charArray = batch.toCharArray();
		System.out.println(charArray[7]);

		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);

		}

		String name = "Vineeth";
		char charAt = name.charAt(6);
		System.out.println(charAt);

	}

}
