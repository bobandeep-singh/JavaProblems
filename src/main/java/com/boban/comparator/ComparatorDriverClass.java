package com.boban.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;

/*
 * We want to implement sorting with multiple fields. While sorting if the value is same then compare with the other field.
 * This is just like group by function in SQL.
 * 
 * 1. Using Collection.sort() in which we pass list as one argument and comparator as 2nd argument.
 * 	  Then you can add multiple comparators using .thenComparing(new ComparatorClass()) on 1st comparator.
 * 
 * 2. Add new dependency: org.apache.commons : commons-lang3
 *    With this you don't have to create new comparators and in the pojo class which is implementing Comparable we can use 
 *    this in compareTo().
 *    Create object of CompareToBuilder and append the fields you want to compare in order and call .toComparision()
 *    which returns an int value.
 *    
 * 3. CompareToBuilder with Comparator Interface: In this we can write CompareToBuilder's functionality in the compare
 *    method itself.
 */
public class ComparatorDriverClass {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Abc", "Goa", 101, 1000000),
				new Employee("Abc", "Noida", 105, 1200000),
				new Employee("Abc", "Noida", 107, 1400000),
				new Employee("Cde", "Goa", 102, 1200000),
				new Employee("Cde", "Noida", 106, 1300000),
				new Employee("Bcd", "Goa", 108, 1200000),
				new Employee("Bcd", "Noida", 104, 1300000),
				new Employee("Abc", "Goa", 103, 1200000),
				new Employee("Cde", "Noida", 102, 1400000));

		sortUsingCollectionThenComparing(list);
		
		usingCompareToBuilder();
		
		compareToBuilderUsingComparatorInterface(list);

	}

	public static void sortUsingCollectionThenComparing(List<Employee> list) {
		Collections.sort(list, new NameComparator()
				.thenComparing(new SalaryComparator()));
		System.out.println("Output of sortUsingCollectionThenSorting: "+list);
	}

	public static void usingCompareToBuilder() {
		List<CompareToBuilderEmployee> list = Arrays.asList(new CompareToBuilderEmployee("Abc", "Goa", 101, 1000000),
				new CompareToBuilderEmployee("Abc", "Noida", 105, 1200000),
				new CompareToBuilderEmployee("Abc", "Noida", 107, 1400000),
				new CompareToBuilderEmployee("Cde", "Goa", 102, 1200000),
				new CompareToBuilderEmployee("Cde", "Noida", 106, 1300000),
				new CompareToBuilderEmployee("Bcd", "Goa", 108, 1200000),
				new CompareToBuilderEmployee("Bcd", "Noida", 104, 1300000),
				new CompareToBuilderEmployee("Abc", "Goa", 103, 1200000),
				new CompareToBuilderEmployee("Cde", "Noida", 102, 1400000));
		
		Collections.sort(list);
		System.out.println("Sorted list using CompareToBuilder: "+list);
	}

	public static void compareToBuilderUsingComparatorInterface(List<Employee> list) {
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				
				return new CompareToBuilder().append(o1.getName(), o2.getName())
											.append(o1.getId(), o2.getId()).toComparison();
			}
		});
		System.out.println("Sorted the list - CompareToBuilder with Comparator Interface :"+list);
	}

}


class CompareToBuilderEmployee implements Comparable<CompareToBuilderEmployee>{
	private String name;
	private String city;
	private int id;
	private int salary;

	public CompareToBuilderEmployee(String name, String city, int id, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
		this.salary = salary;
	}

	//In this method we will use the features of the jar
	@Override
	public int compareTo(CompareToBuilderEmployee o) {
		if(null == o) {
			return -1;
		}

		CompareToBuilder builder = new CompareToBuilder();
		return builder.append(this.name, o.getName())
				.append(this.id, o.getId()).toComparison();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", id=" + id + ", salary=" + salary + "]";
	}
}