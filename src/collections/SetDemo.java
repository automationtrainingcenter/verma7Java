package collections;
/*
 *Set is a collection type and it's an interface
 *Set does not allow duplicate data
 *Set is not index based like List
 *Set interface is implemented by three classes
 *1. HashSet it will not maintain any order for your data
 *2. LinkedHashSet it will maintain insertion order
 *3. TreeSet it will maintain ascending for numeric data and alphabetical order for character data 
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// create a Set
//		Set<String> courses = new HashSet<>();
//		Set<String> courses = new LinkedHashSet<>();
		Set<String> courses = new TreeSet<>();
		
		
		// find the number of values in the Set using size()
		System.out.println(courses.size());

		// find the set is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the set
		courses.add("c");
		courses.add("cpp");
		courses.add("Python");
		courses.add("Java");
		courses.add("selenium");
		courses.add("cpp");
		courses.add("testing");
		courses.add("flask");

		System.out.println(courses.size());

		System.out.println(courses);

		// retrieve the data from set using for each loop
		for (String course : courses) {
			System.out.println(course.toUpperCase());
		}
		System.out.println("**************************************************");
		// retrieve the data from set using Iterator interface
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toUpperCase());
		}

		// delete the data from the set
		courses.remove("testing");
		System.out.println(courses);
		
		// search for a value in the list
		System.out.println(courses.contains("flask"));
		
		
		// remove all the values from the set 
		courses.clear();
		
		System.out.println(courses);
		
		
		
	}

}
