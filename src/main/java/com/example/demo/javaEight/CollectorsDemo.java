package com.example.demo.javaEight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));
        employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Alex", 34, 56000));
        employeeList.add(new Employee("Jodi", 43, 67000));
        employeeList.add(new Employee("Ryan", 53, 54000));

       // Using the counting() method to get count of employees.

        long count = employeeList
                .stream()
                        .filter(e -> e.getAge() > 30)
                                .count();

        int salaryCount = employeeList.stream().mapToInt(e -> e.getSalary()).sum();

        //average
        OptionalDouble average = employeeList.stream().mapToInt(e -> e.getSalary()).average();

        //min salary
        Optional<Employee> emp = employeeList.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        employeeList.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));



        System.out.println(count);
        System.out.println(salaryCount);
        average.ifPresent(System.out::println);
        System.out.println(emp.get().getName());

        // Joining all the strings.
        String joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining());
        System.out.println(joinedString);

        // Joining all the strings with space in between.
        joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(" "));
        System.out.println(joinedString);

        // Joining all the strings with space in between and a prefix and suffix.
        joinedString = Stream.of("hello", "how", "are" , "you")
                .collect(Collectors.joining(" " , "prefix","suffix"));
        System.out.println(joinedString);

    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
