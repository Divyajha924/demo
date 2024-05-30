package com.interview.question.rSystem;

final public class Student {

   final private int id;

   final private String name;

   final private Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;

        Address address1 = new Address(address.getCity());
       // address1.setCity(address.getCity());
        this.address = address1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {

        Address address1 = new Address(address.getCity());
        return address1;
    }
}
