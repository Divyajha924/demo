package com.interview.question.amex;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    //compare Employee by salary and compare by age;

    public static void main(String[] args) {

       Employee emp1 = new Employee(30,12345);
        Employee emp2 = new Employee(31,12346);
       Employee emp3 = new Employee(32,12347);
        Employee emp4 = new Employee(33,12348);

        List<Employee> emplist = new ArrayList<>();
        emplist.add(emp2);
        emplist.add(emp1);
        emplist.add(emp4);
        emplist.add(emp3);

        Comparator<Employee> compareBySalary = Comparator.comparingLong(Employee::getSalary);
        Comparator<Employee> compareByAge = Comparator.comparingInt(Employee::getAge);

        Collections.sort(emplist,compareBySalary);

        for(int i =0; i< emplist.size();i++){
            System.out.println(emplist.get(i).getSalary());
        }


    }
}
