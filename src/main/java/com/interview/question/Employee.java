package com.interview.question;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    int deptid;

    public Employee(int id, String name, int deptid) {
        super();
        this.id = id;
        this.name = name;
        this.deptid = deptid;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDeptid() {
        return deptid;
    }
    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
    public static void main(String[] args) {


        List<Employee> empList=new ArrayList();
        Employee e=new Employee(1,"N1",1);
        Employee e1=new Employee(1,"N2",2);
        Employee e2=new Employee(1,"N3",1);
        Employee e3=new Employee(1,"N4",4);
        empList.add(e);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        // deptid , list of em List<Integer,List<String>>
        Map<Integer,List<Employee>> map = new HashMap<>();
         map= empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptid));

         System.out.println(map);


    }
}