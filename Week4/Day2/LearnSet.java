package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Declare an empty Set
		// HashSet
		Set<String> mentors = new HashSet<String>();

		// TreeSet
		// Set<String> mentors=new TreeSet<String>();

		// LinkedHashSet
		// Set<String> mentors=new LinkedHashSet<String>();

		System.out.println("The Set is: " + mentors);

		// add
		mentors.add("Bhuvanesh");
		mentors.add("Vinoth");
		mentors.add("Anburaj");
		mentors.add("Muthu");

		System.out.println("The Set is: " + mentors);

		int size = mentors.size();
		System.out.println("The size is: " + size);

		mentors.add("Harrish");

		// Add duplicate value
		mentors.add("Bhuvanesh");
		System.out.println("The current set is: " + mentors);

		// remove an element
		mentors.remove("Vinoth");
		System.out.println("The set is: " + mentors);

		// Get- To retrive a particular
		
		// Declare an empty List
          List<String> trainers = new ArrayList<String>(mentors);
		System.out.println("The List is :" + trainers);

		String string = trainers.get(2);
		System.out.println(string);

	}

}
