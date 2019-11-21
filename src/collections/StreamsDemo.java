package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<String> courses = new LinkedList<>();
		courses.add("c");
		courses.add("cpp");
		courses.add("Java");
		courses.add("Python");
		courses.add("cpp");
		courses.add("selenium");
		courses.add("testing");
		courses.add("flask");
		courses.add("django");
		courses.add("kotlin");
		courses.add("php");
		courses.add("devops");
		courses.add("aws");

//		List<String> ucourses = new LinkedList<>();
//		for (String course : courses) {
//			String ucourse = course.toUpperCase();
//			ucourses.add(ucourse);
//		}

//		List<String> filterCourses = new LinkedList<>();
//		for (String course : courses) {
//			String ucourse = course.toUpperCase();
//			if (ucourse.length() > 3) {
//				filterCourses.add(ucourse);
//			}
//		}

//		for (String course : filterCourses) {
//			System.out.println(course);
//		}

//		Stream<String> filterCourses = courses.stream().map(course -> course.toUpperCase()).filter(ucourse -> ucourse.length()>3);
//		filterCourses.forEach(course -> System.out.println(course));
		courses.stream().map(course -> course.toUpperCase()).filter(ucourse -> ucourse.length() > 3)
				.forEach(fcourse -> System.out.println(fcourse));
	}

}
