package week2.day1;

public class FibbonacciSeries {

	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		// System.out.println(firstNumber);
		// System.out.println(secondNumber);
		for (int i = 1; i <= 8; i++) {
			System.out.println(firstNumber);
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}

	}

}
