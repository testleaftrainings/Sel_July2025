package week2.day2;

public class PalindromeNumberUsingWhileLoop {

	public static void main(String[] args) {

		int input = 12122;
		int temp = input;
		int output = 0;
		int remainder;

		while (input > 0) {
			remainder = input % 10;
			output = (output * 10) + remainder;
			input = input / 10;
		}

		if (temp == output) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
