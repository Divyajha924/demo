package com.interview.question.amex;

public class Employee {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int age, long salary) {
        this.age = age;
        this.salary = salary;
    }

    private long salary;
}
