package collections;
/*
 * Map is also collection type which is used to store the data in key and value pairs
 * Map is an interface which is implemented three classes
 * 1 HashMap it will not maintain any order
 * 2 LinkedHashMap it will maintain insertion order
 * 3 TreeMap it will maintain ascending for numeric data and alphabetical order for character data based
 * on keys
 * 
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		// create a map
		Map<String, Integer> courses = new TreeMap<>();

		// find the number of values in a Map
		System.out.println(courses.size());

		// verify a map is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the map
		courses.put("c", 30);
		courses.put("cpp", 45);
		courses.put("Java", 45);
		courses.put("python", 60);
		courses.put("selenium", 80);
		courses.put("testing", 100);
//		courses.put("cpp", 40);
		courses.put("Flask", 30);

		// to print the map on the console
		System.out.println(courses);

		// to retrieve a data from the map
		System.out.println(courses.get("selenium"));
		
		// retrieve all the keys of a map
		Set<String> keys = courses.keySet();
		for(String key : keys) {
			System.out.println(key+ " ===== "+ courses.get(key));
		}
		
		// retrieve all the values of a map
		Collection<Integer> values = courses.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println("********************************");
		// retrieve both key and values pairs from the map
		Set<Entry<String, Integer>> pairs = courses.entrySet();
		Iterator<Entry<String, Integer>> it = pairs.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> next = it.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		
		}
		// to update the data of a key we can use put() with key you want to update and new value
		courses.put("cpp", 40);
		System.out.println(courses);
		
		// to delete the key from a map we have to remove()
		Integer value = courses.remove("cpp");
		System.out.println(value);
		System.out.println(courses);
		
		
		System.out.println(courses.remove("java", 45));
		System.out.println(courses);
		
		// to search a data in the map
		System.out.println(courses.containsKey("c"));
		
		System.out.println(courses.containsValue(80));
		
		// to remove all the data from the map
		courses.clear();
		System.out.println(courses);
	}	
}
