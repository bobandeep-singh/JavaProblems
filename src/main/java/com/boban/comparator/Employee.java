package com.boban.comparator;

public class Employee {

	private String name;
	private String city;
	private int id;
	private int salary;
	public Employee(String name, String city, int id, int salary) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
		this.salary = salary;
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
