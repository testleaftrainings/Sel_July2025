package week2.day2;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PalindromeNumberUsingForLoop {

	public static void main(String[] args) {

		int input = 12121;
		int temp = input;
		int output = 0;
		int remainder;

		for (input = input; input > 0; input = input / 10) {
            remainder = input % 10;
			output = (output * 10) + remainder;
		}

		// input=0
		// output=12121
		if (temp == output) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
