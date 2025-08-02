package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		// using Array Literal

		// index 0 1 2 3 4
		int[] scores = { 89, 98, 100, 78, 61 };

		// To count the number of data-length
		int lengthOfArray = scores.length;
		System.out.println("The length is: " + lengthOfArray);

		// To retrieve a data
		System.out.println(scores[3]);

		System.out.println("----------");

		// To retrieve all the data
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// To print the lowest number and highest number
		// Arrange the Array in ascending
		Arrays.sort(scores);
		// {61,78,89,98,100}

		// To print the lowest number
		System.out.println(scores[0]);

		// To print the highest number
		System.out.println(scores[lengthOfArray - 1]);

		// Using Instantiation
		int num[] = new int[4];
		num[0] = 67;
		num[1] = 89;
		num[2] = 100;
		num[3] = 78;

		System.out.println(num[3]);

	}

}
