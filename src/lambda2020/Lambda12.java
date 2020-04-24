package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda12 {

	public static void main(String[] args) {

		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		System.out.println(courseList);
		System.out.println("=========================");

		// Check if all average scores are more than 90
		System.out.println(courseList.stream()
				  					 .allMatch(t->t.getAverageScore()>90)); // true
		
		// Check if all course names contains the word "Day"
		System.out.println(courseList.stream()
									 .allMatch(t->t.getCourseName().contains("Day")));
	
		// Check if any number of students is 154
		System.out.println(courseList.stream()
									 .anyMatch(t->t.getNumberOfStudents()==154));
	
		// Check if any season contains "Winter" ----------- ANYMATCH
		System.out.println(courseList.stream()
									 .anyMatch(t->t.getSeason().contains("Winter")));
		
		// Check if no number of students is equal to 0
		System.out.println(courseList.stream()
									 .noneMatch(t->t.getNumberOfStudents()==0));
		
		// Sort the list elements according to the number of students
		Comparator<Course> comparatorForNumOfStudents = Comparator.comparing(Course::getNumberOfStudents);
		courseList.stream()
				  .sorted(comparatorForNumOfStudents)
				  .collect(Collectors.toList());			// .forEach(System.out::println)
		System.out.println("****************");
		// Sort the elements according to the name of the course --------- reversed
		Comparator<Course> comparatorForNameOfCousre = Comparator.comparing(Course::getCourseName).reversed();		
		System.out.println(courseList.stream()
									 .sorted(comparatorForNameOfCousre)
									 .collect(Collectors.toList()));
		System.out.println("****************");
		// Sort the elements by using season and average score
		Comparator<Course> comparatorForSeasonAndScore = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
		System.out.println(courseList.stream()
									 .sorted(comparatorForSeasonAndScore)
									 .limit(3) // you can put limit
									 .collect(Collectors.toList()));
		
		// Print the element whose number of students is maximum on the console by using sort and limit methods.
		Comparator<Course> comparatorForMaxNumOfStudents = Comparator.comparing(Course::getNumberOfStudents).reversed();
		System.out.println(courseList.stream()
									 .sorted(comparatorForMaxNumOfStudents)
									 .limit(1) // you can put limit
									 .collect(Collectors.toList()));
		
		
		// Print the element whose number of students is SECOND maximum on the console by using sort and limit methods.
		Comparator<Course> comparatorForSecondMaxNumOfStudents = Comparator.comparing(Course::getNumberOfStudents).reversed();
		System.out.println(courseList.stream()
									 .sorted(comparatorForSecondMaxNumOfStudents)
									 .skip(1) // you can skip
									 .limit(1) // you can put limit
									 .collect(Collectors.toList()));
		
		// Find the first element
		System.out.println(courseList.stream()
									 .findFirst());
		
		
		// Find the first element
		System.out.println(courseList.stream()
									 .findAny());
		
		// Find the last element
		Comparator<Course> comparatorForLastOne = Comparator.comparing(Course::getNumberOfStudents).reversed();
		System.out.println(courseList.stream()
									 .sorted(comparatorForLastOne)
									 .findFirst());
		
		// Find the sum of the number of students whose average scores are more than 95
		System.out.println(courseList.stream()
				  					 .filter(t->t.getAverageScore()>95)
				  					 .mapToInt(Course::getNumberOfStudents)  // mapToInt() method converts stream values to integers
				  					 .sum());
		
		// Find the average of the number of students whose average scores are more than 93
		System.out.println(courseList.stream()
						  			 .filter(t->t.getAverageScore()>95)
						  			 .mapToDouble(Course::getNumberOfStudents)  // total/3=result
						  			 .average());
		
		// Find the number of courses whose average grades are more than 93
		System.out.println(courseList.stream()
					 				 .filter(t->t.getAverageScore()>93)
					 				 .count());
		
		// Group the courses according to the season
		System.out.println(courseList.stream()
									 .collect(Collectors.groupingBy(Course::getSeason)));
		
		// Find the numbers of the courses according to the season
		System.out.println(courseList.stream()
									 .collect(Collectors.groupingBy(Course::getSeason, Collectors.counting())));
		
		// Find the numbers of courses according to the course
		System.out.println(courseList.stream()
									 .collect(Collectors.groupingBy(Course::getCourseName, Collectors.counting())));
		
	
	}

}
