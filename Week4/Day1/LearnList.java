package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declare an empty List
		List<String> learnersList = new ArrayList<String>();
		System.out.println("The List is: " + learnersList);

		// add an element inside the List-add()
		learnersList.add("Rajesh");
		System.out.println("The List after adding 1 data: " + learnersList);

		// add more elements
		learnersList.add("Venkatesh");
		learnersList.add("Bharath");

		int sizeOfList = learnersList.size();
		System.out.println("The List after 3 Data: " + sizeOfList);

		System.out.println("List after adding multiple data: " + learnersList);

        // add duplicates
		learnersList.add("Venkatesh");
		System.out.println("List after adding duplicates: " + learnersList);

	   // add an element based on index
		learnersList.add(1, "Selvi");
		System.out.println("List after adding by index: " + learnersList);
	
        // remove an element
		// learnersList.remove(2);
		learnersList.remove("Venkatesh");
		System.out.println("The list is: " + learnersList);
		
		// To retrieve a particular value from a List- get-index
		String valueAtIndex1 = learnersList.get(3);
		System.out.println("The value at 1st index: " + valueAtIndex1);

		// addAll- add all the data from one List to another List
        List<String> employees = new ArrayList<String>();
		System.out.println("The employees list is: " + employees);
		employees.addAll(learnersList);
		System.out.println("The employees List: " + employees);

		// clear all the data
		learnersList.clear();
		System.out.println("The learners List is: " + learnersList);
	}

}
