package com.boban.lambdas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreams {

	public static void main(String[] args) throws IOException {

		/*One*/
		Stream<String> fileStream = Files.lines(Paths.get("C:\\workspaces\\BobanProjects\\JavaProblems\\src\\main\\resources\\TextFileForStreams.txt"));
		fileStream.sorted().filter(x -> x.length() > 20).forEach(System.out::println);
		//fileStream.close();

		/*Two*/
		Stream<String> fileStreamTwo = Files.lines(Paths.get("C:\\workspaces\\BobanProjects\\JavaProblems\\src\\main\\resources\\TextFileForStreams.txt"));
		List<String> list = fileStreamTwo.filter(x -> x.contains("bnm")).collect(Collectors.toList());

		list.forEach(System.out::println);


		//Create a list of car objects and compute the most expensive car using streams.
		List<Car> carList = Arrays.asList(
				new Car("CarOne", "2014", 5),
				new Car("CTVYGBUHNIJ", "2018", 2),
				new Car("RFYGUBHN", "2018", 3),
				new Car("TDRFYTGUYB", "2016", 10)
				);
		Optional<Integer> sum = Arrays.asList(4,5,12,7,4,8).stream().reduce((s1,s2) -> s1 + s2);
		sum.ifPresent(System.out::println);
		OptionalInt sum2 = carList.stream().mapToInt(Car::getPrice).reduce((p1, p2) -> p1 + p2);
		sum2.ifPresent(System.out::println);

		OptionalInt sum3 = carList.stream().mapToInt(Car::getPrice).reduce((p1, p2) -> p1 + p2);
		sum2.ifPresent(System.out::println);

	}

}


class Car{
	private String name;
	private String year;
	private int price;
	public Car(String name, String year, int price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", price=" + price + "]";
	}

}