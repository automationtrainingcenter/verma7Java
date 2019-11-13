package collections;

import java.util.LinkedList;
import java.util.List;

/*
 * Collections are used to store a collection similar type data
 * List is an interface and is a collection type
 * List interface is implemented by ArrayList and LinkedList classes
 * List is index based and index number starts with 0
 * List will append new data i.e. List maintains insertion order
 */

public class ListDemo {
	public static void main(String[] args) {
		// create a List
		List<String> courses = new LinkedList<>();

		// find the number of elements in list
		System.out.println(courses.size());

		// verify a list is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the list
		courses.add("c");
		courses.add("cpp");
		courses.add("Java");
		courses.add("Python");
		courses.add("cpp");
		courses.add("selenium");
		courses.add("testing");

		System.out.println(courses.size());

		// print all the list values on console
		System.out.println(courses);

		// retrieve the data from the list using index number
		System.out.println(courses.get(3));

		// retrieve all the data by iterating over list using normal for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).toUpperCase());
		}

		// retrieve all the data by iterating over list using for each loop
		for (String course : courses) {
			System.out.println(course.length());
		}

		// insert the data at a given index number
		courses.add(2, "Ruby");
		System.out.println(courses);
		
		// update the data at a given index number
		courses.set(5, "django");
		System.out.println(courses);
		
		
		// delete the data from a list using index number
		courses.remove(3);
		System.out.println(courses);
		
		
		// remove all the data from the list
		courses.clear();
		System.out.println(courses);
	}
}
