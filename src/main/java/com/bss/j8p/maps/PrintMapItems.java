package com.bss.j8p.maps;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintMapItems {

	public static void main(String[] args) {
		List<User> users = List.of(new User(1L, "Andrew", 23), new User(2L, "Billy", 42), new User(3L, "David", 29),
				new User(4L, "Charlie", 30), new User(5L, "Andrew", 18), new User(6L, "Charlie", 19));

		Map<Long, String> map = users.stream().collect(Collectors.toMap(User::getId, User::getName));

		Map<Long, User> map1 = users.stream().collect(Collectors.toMap(User::getId, Function.identity()));

		// users.stream().collect(Collectors.toMap(User::getId,
		// User::getName)).entrySet().stream().forEach(System.out::println);

		map1.keySet().stream().forEach(el -> System.out.println(el));
		map1.entrySet().stream().forEach(el -> System.out.println(el.getValue().getName()));
		// map.values().stream().forEach(el-> System.out.println(el));

		map1.values().stream().forEach(el -> System.out.println(el.getAge()));
	}

}

class User {
	Long id;
	String name;
	Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public User(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}