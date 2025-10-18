package com.bss.j8p.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	private String department;
	private Integer mgrId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getMgrId() {
		return mgrId;
	}

	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	public Employee() {
	}

	public Employee(Integer id, String name, Integer age, Double salary, String department, Integer mgrId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.mgrId = mgrId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + ", mgrId=" + mgrId + "]";
	}

}

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		Employee emp = new Employee(1, "Kumar", 25, 10000.00, "Dev", 11);
		empList.add(emp);

		emp = new Employee(2, "Raju", 35, 20000.00, "Dev", 11);
		empList.add(emp);

		emp = new Employee(3, "Kapoor", 45, 30000.00, "Test", 13);
		empList.add(emp);

		emp = new Employee(4, "Reddy", 40, 8000.00, "HR", 15);
		empList.add(emp);

		emp = new Employee(5, "Rao", 40, 9000.00, "HR", 15);
		empList.add(emp);

		emp = new Employee(6, "Sharma", 30, 30000.00, "Dev", 11);
		empList.add(emp);

		emp = new Employee(7, "Yadav", 35, 40000.00, "Test", 13);
		empList.add(emp);

		emp = new Employee(8, "Devi", 30, 10000.00, "HR", 15);
		empList.add(emp);

		emp = new Employee(9, "Babbar", 25, 50000.00, "Test", 13);
		empList.add(emp);

		emp = new Employee(10, "Kohli", 30, 50000.00, "Test", 13);
		empList.add(emp);

		System.out.println("List of Employees whose Department starts with D");
		empList.stream().filter(e -> e.getDepartment().startsWith("D")).forEach(f -> System.out.println(f.getName()));

		System.out.println("List of Employees whose Department is Test and age > 25");
		empList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("test")).filter(e -> e.getAge() > 25)
				.forEach(System.out::println);

		// sort based on Name
		System.out.println("Sort based on Name");
		empList.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		empList.forEach(item -> System.out.println(item));

		// sort based on Age
		System.out.println("Sort based on Age");
		Collections.sort(empList, Comparator.comparing(Employee::getAge));
		empList.forEach(item -> System.out.println(item));

		// sort based on multiple attributes
		System.out.println("Sort based on multiple attributes");
		empList.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary));
		empList.forEach(item -> System.out.println(item));

		System.out.println("Sort based on multiple attributes with separate comparator");
		Comparator<Employee> sortByName = (b1, b2) -> b1.getName().compareToIgnoreCase(b2.getName());
		Comparator<Employee> sortByAge = (b1, b2) -> b1.getAge().compareTo(b2.getAge());
		Comparator<Employee> sortBySalary = (b1, b2) -> Double.compare(b1.getSalary(), b2.getSalary());

		empList.stream().sorted(sortByName.thenComparing(sortByAge).thenComparing(sortBySalary))
				.forEach(e -> System.out.println(e));

		// find highest salary employee in each department
		System.out.println("find highest salary employee in each department");
		Map<String, Optional<Employee>> highestPaidByDept = empList.stream()
	            .collect(Collectors.groupingBy(
	                Employee::getDepartment,
	                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
	            ));

		System.out.println(highestPaidByDept);

		// list of employees whose salary is less than 10000 and sort in descending order on name
		System.out.println("list of employees whose salary is less than 10000 and sort in descending order on name");
		empList.stream().filter(e -> e.getSalary() < 10000)
		.sorted(Comparator.comparing(Employee::getName).reversed())
		.forEach(System.out::println);


	}
}
