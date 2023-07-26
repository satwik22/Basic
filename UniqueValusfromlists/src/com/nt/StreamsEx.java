package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Stream<Employee> of = Stream.of(new
		 * Employee(100,"mallesh",254163.0,"hyderabad","telangana",
		 * "mallesh2299@gmail.com",8977233389L), new
		 * Employee(101,"mohan",254163.0,"gadhwal","telangana","mohan2299@gmail.com",
		 * 5263417895L), new
		 * Employee(102,"yadav",56854.0,"wanaparthy","telangana","yadav2299@gmail.com",
		 * 7458962145L), new
		 * Employee(103,"suresh",63254.0,"kothakota","telangana","suresh2299@gmail.com",
		 * 2458963214L), new
		 * Employee(104,"kamal",875459.0,"shadnagar","telangana","kamal2299@gmail.com",
		 * 7485962145L), new Employee(105,"prabhas",41526.0,"jedcherla","telangana",
		 * "prabhas2299@gmail.com",3526417896L), new
		 * Employee(106,"karthik",89657.0,"nagarkarnool","telangana",
		 * "karthik2299@gmail.com",5896475126L));
		 */
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(100, "mallesh", 254163.0, "hyderabad", "telangana", "mallesh2299@gmail.com",
				Arrays.asList(524168564L, 8977233389L)));
		emp.add(new Employee(101, "mohan", 254163.0, "gadhwal", "telangana", "mohan2299@gmail.com",
				Arrays.asList(1452635241L, 5263417895L)));
		emp.add(new Employee(102, "yadav", 56854.0, "wanaparthy", "telangana", "yadav2299@gmail.com",
				Arrays.asList(457852146L, 7458962145L)));
		emp.add(new Employee(103, "suresh", 63254.0, "kothakota", "telangana", "suresh2299@gmail.com",
				Arrays.asList(415263895L, 2458963214L)));
		emp.add(new Employee(104, "kamal", 875459.0, "shadnagar", "telangana", "kamal2299@gmail.com",
				Arrays.asList(458665217L, 7485962145L)));
		emp.add(new Employee(105, "prabhas", 41526.0, "jedcherla", "telangana", "prabhas2299@gmail.com",
				Arrays.asList(785496514L, 3526417896L)));
		emp.add(new Employee(106, "karthik", 89657.0, "nagarkarnool", "telangana", "karthik2299@gmail.com",
				Arrays.asList(5896475126L, 541263985L)));

		//of.filter(s -> s.getEmpName().startsWith("m")).forEach(t -> System.out.println(t));
		//of.filter(s -> s.getEmpsal() > 200000).forEach(System.out::println);
		;

		emp.stream().filter(s -> s.getEmpName().startsWith("m")).forEach(t -> System.out.println(t));
		emp.stream().sorted(Comparator.comparing(e -> e.getEmpEmailid())).forEach(t -> System.out.println(t));
		emp.stream().filter(s -> s.getEmpName().startsWith("k")).sorted(Comparator.comparing(e -> e.getEmpEmailid()))
				.forEach(t -> System.out.println(t));
		emp.stream().map(s -> s.getEmpName().toUpperCase()).forEach(System.out::println);
		emp.stream().map(s -> s.getEmpphonenumbers()).forEach(System.out::println);
		List<List<Long>> collect2 = emp.stream().map(s -> s.getEmpphonenumbers()).collect(Collectors.toList());
		emp.stream().forEach(System.out::println);
		System.out.println(collect2);
		List<Long> collect = emp.stream().flatMap(s -> s.getEmpphonenumbers().stream()).collect(Collectors.toList());
		System.out.println(collect);
		// Stream<Employee> collect3 =
		// emp.stream().filter(s->(Comparator.comparingDouble(s.getEmpsal())));
		// System.out.println(collect3);

	}

}
