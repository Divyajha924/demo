package com.example.demo.javaEight;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingByJava {

        public static void main(String args[]) {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("Alex", 23, 23000, "USA"));
            employeeList.add(new Employee("Ben", 63, 25000, "China"));
            employeeList.add(new Employee("Dave", 34, 56000, "India"));
            employeeList.add(new Employee("Jodi", 43, 67000, "USA"));
            employeeList.add(new Employee("Ryan", 53, 54000, "China"));

            // The employees are grouped by country using the groupingBy() method.
            Map<String,List<Employee>> map = new HashMap<>();
            map = employeeList.stream()
                            .collect(Collectors.groupingBy(Employee::getCountry));



            System.out.println(map);
        }

    static class Employee {
        String name;
        int age;
        int salary;
        String country;

        Employee(String name, int age, int salary, String country) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.country = country;
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

        public String getCountry() {
            return country;
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

}
