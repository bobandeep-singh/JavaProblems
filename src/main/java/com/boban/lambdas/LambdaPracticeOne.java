package com.boban.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaPracticeOne {

	public static void main(String[] args) {


		AnnotatedInterface x = () -> System.out.println("Hello Boban");

		x.getGreetings();



		List<Person> people = Arrays.asList(
				new Person("WSEDRTFG", "TFYGHJ", 671),
				new Person("EDRGH", "DCFVBH", 2456),
				new Person("IOUJHG", "FYGVBHN", 32365),
				new Person("ERFTG", "SEDRFTY", 4784),
				new Person("DTRFHIJ", "RDFGH", 2565),
				new Person("EDTRFGUHI", "DRDFGHJ", 6456)
				);


		//#1. Sort list by last name:
		/*Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
			}
		});*/
		
		Collections.sort(people, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName())  );


		//#2. Create a method that print all the elements in the list
		printAll(people);
		
		

		//#3. Creates a method whose last name starts with D
		printConditionally(people);
	}

	private static void printConditionally(List<Person> people ) {
		System.out.println("printLastNameBeginnigWith(+)");
		for(Person p: people) {
			if(p.getLastName().startsWith("D")){
				System.out.println(p.toString());
			}
		}
		System.out.println("printLastNameBeginnigWith(-)");
	}

	private static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p.toString());
		}

	}

}
