package com.interview.question.silverMine;

public final class Employee {

    private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof Employee){
          Employee e =  (Employee) o;
          if(this.id == e.id && this.name.equals(e.name)) return true;
          else return false;
       }
       return false;
    }

    @Override
    public int hashCode() {
        return id*3;
    }
}
