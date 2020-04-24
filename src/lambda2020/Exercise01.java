package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(12);
		List<String> list2=new ArrayList<String>();
		list2.add("Ali");
		list2.add("Mark");
		list2.add("Jack");
		list2.add("Amy");
		list2.add("Chris");
		list2.add("Tucker");
//Exercise 1: Print all odd numbers from the list [12, 9, 13, 4, 6, 2, 4, 12, 15] by Functional Programming
		list.stream()
			.filter(t->t%2!=0)
			.map(t->t + " - ")
			.forEach(System.out::println);				System.out.println("====================222");
//Exercise 2: Print all names contains "c" in the list [Ali, Mark, Jack, Amy, Chris, Tucker] by Functional Programming
		list2.stream()
			 .filter(t->t.contains("c"))
			 .forEach(System.out::println);				System.out.println("====================333");
//Exercise 3: Print all names has at least 4 letters in the list [Ali, Mark, Jack, Amy, Chris, Tucker] by Functional Programming
		list2.stream()
			 .filter(t->t.length()>3)
			 .forEach(System.out::println);				System.out.println("====================444");
//Exercise 4: Print the cube of all odd numbers from the list [12, 9, 13, 4, 6, 2, 4, 12, 15] by Functional Programming
		list.stream()
			.filter(t->t%2==1)
			.map(t->t*t*t)
			.forEach(System.out::println);				System.out.println("====================555");
//Exercise 5: Print the squares of the number of characters in the list [Ali, Mark, Jack, Amy, Chris, Tucker] by Functional Programming
		list2.stream()
			 .map(t->t.length()*t.length())
			 .forEach(System.out::println); 			System.out.println("====================666");		
//Exercise 6: Find the sum of the square of every number in the list	Third solution for multiply each of them all together		 
		System.out.println(list.stream()
							   .map(t->t*t)
							   .reduce(0,Integer::sum));
		System.out.println(list.stream()
							   .reduce(1, Math::multiplyExact));
		System.out.println(list.stream()
	   			   .map(t->t*t)
	   			   .reduce(0, (a,b)->a+b));
		
//Exercise 7: Find the average value of all numbers			 
		System.out.println(list.stream()
							   .reduce(0, (a,b)->(a+b))/list.size());
														System.out.println("====================777");
//Exercise 8:Print all elements on the console after sorting by using "Functional" programming
		list2.stream()
			.sorted()
			.forEach(System.out::println);				System.out.println("====================");
		list.stream()
			.sorted()
			.forEach(System.out::println); 				System.out.println("====================");
//Exercise 9:Print all distinct elements on the console by using "Functional" programming
		list.stream()
			.sorted()
			.distinct()
			.forEach(System.out::println);				System.out.println("====================");
//Exercise 10:Print all distinct elements on the console after reverse sorting by using "Functional" programming
		list.stream()
			.sorted(Comparator.reverseOrder())
			.distinct()
			.forEach(System.out::println);				System.out.println("====================");
		list2.stream()
			 .sorted(Comparator.reverseOrder())
			 .distinct()
			 .forEach(System.out::println);				System.out.println("====================");
//Exercise 11:Print all elements on the console after sorting according to the length by using "Functional" programming
		 list2.stream()
		 	  .sorted(Comparator.comparing(t->t.length()))
		 	  .forEach(System.out::println);			System.out.println("====================");
//Exercise 12:Print the cube of all even elements in "a new list" by using "Functional" programming
		System.out.println(list.stream()
							   .filter(t->t%2==0)
							   .map(t->t*t*t)
							   .collect(Collectors.toList())); 					System.out.println("====================");
//Exercise 14:Print the length of all elements in "a new list" by using "Functional" programming
		System.out.println(list2.stream()
							   .map(t->t.length())
							   .collect(Collectors.toList())); 					System.out.println("====================");
//Exercise 15:Convert all letters to lower case and print on the console by using "Functional" programming
		list2.stream()
			 .map(t->t.toLowerCase())
			 .forEach(System.out::println);				System.out.println("====================");
		list2.stream()
    		 .map(t->t.toUpperCase())
    		 .forEach(System.out::println);				System.out.println("====================");
    	list2.stream()
    		 .map(String::toLowerCase)
    		 .forEach(System.out::println);				System.out.println("====================");
    	
    	list2.replaceAll(t->t.toUpperCase());
    	System.out.println(list2);						System.out.println("====================");
//Exercise 16:Print all initials in upper case on the console by using "Functional" programming
    	list2.stream()
			 .map(t->t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase())
			 .forEach(System.out::println);				System.out.println("====================FINAL");		 
//Exercise 17:Create a new Class (like Course Class), then create 5 objects from the Class and do all exercises in Lambda12 class
			 
		Market finance 			= new Market("Online", "Finanser", 7000.00, 46); 
		Market management 		= new Market("Fulltime", "Manager", 10000.00, 12);
		Market human_resource 	= new Market("Parttime", "Psychologist", 6000.00, 25);
		Market production 		= new Market("Fulltime", "Worker", 3000.00, 342);
			 
		List<Market> employees 	= new ArrayList<>();
		employees.add(finance);
		employees.add(management);
		employees.add(human_resource);
		employees.add(production);
		System.out.println(employees);
			 
		// Check if number of employees are less than 50
		System.out.println(employees.stream()
									.allMatch(t->t.getNumOfEmp()<300)); //False
		System.out.println(employees.stream()
									.anyMatch(t->t.getNumOfEmp()<340));	//True
		// Check if any Work Type conains "e"
		System.out.println(employees.stream()
									.anyMatch(t->t.getWorkType().contains("e")));
		System.out.println(employees.stream()
									.noneMatch(t->t.getWorkType().contains("z")));
		
		
		System.out.println("****************Comparators*****************");
		Comparator<Market> comparatorForSalaryOfWorkers=Comparator.comparing(Market::getSalary);
		System.out.println(employees.stream()
									.sorted(comparatorForSalaryOfWorkers)
									.collect(Collectors.toList()));
		Comparator<Market> comparatorForNumbOfEmps=Comparator.comparing(Market::getNumOfEmp).reversed();
		System.out.println(employees.stream()
									.sorted(comparatorForNumbOfEmps)
									.collect(Collectors.toList()));
		Comparator<Market> comparatorForEmployee = Comparator.comparing(Market::getEmployee);
		System.out.println(employees.stream()
									.sorted(comparatorForEmployee)
									.collect(Collectors.toList()));
		Comparator<Market> comparatorForWorkType = Comparator.comparing(Market::getWorkType).thenComparing(Market::getSalary);
		System.out.println(employees.stream()
									.sorted(comparatorForWorkType)
									.collect(Collectors.toList()));
		
		System.out.println("****************First-Last-Any*****************");	
		
		System.out.println(employees.stream()
									.findFirst());
		System.out.println(employees.stream()
									.findAny());
		Comparator<Market> comparatorForLastOne = Comparator.comparing(Market::getSalary).reversed();
		System.out.println(employees.stream()
									.sorted(comparatorForLastOne)
									.findFirst());
		
		System.out.println("**************** Math *****************");
		System.out.println(employees.stream()
									.filter(t->t.getSalary()>5000)
			 						.mapToInt(Market::getNumOfEmp)
			 						.sum());
			 
		System.out.println(employees.stream()
									.filter(t->t.getSalary()>5000)
									.mapToDouble(Market::getSalary)
									.average());	 
		System.out.println(employees.stream()
									.filter(t->t.getNumOfEmp()>10)
									.count());	 
			 
		System.out.println("**************** Grouping *****************");	 	 
		
		System.out.println(employees.stream()
									.collect(Collectors.groupingBy(Market::getWorkType, Collectors.counting())));	 
		System.out.println(employees.stream()
									.collect(Collectors.groupingBy(Market::getWorkType)));
		System.out.println(employees.stream()
									.collect(Collectors.groupingBy(Market::getEmployee, Collectors.counting())));
		System.out.println(employees.stream()
									.collect(Collectors.groupingBy(Market::getNumOfEmp, Collectors.counting())));	 
	  
	}
}
