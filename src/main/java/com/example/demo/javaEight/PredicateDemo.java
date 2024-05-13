package com.example.demo.javaEight;

import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isPersonEligibleForVoting(Person p ,Predicate<Person> predicate){
       return  predicate.test(p);
    }

    static boolean isPersonNotEligibleForVoting(Person p ,Predicate<Person> predicate){
        return  predicate.negate().test(p);
    }
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

        public static void main(String[] args) {

          Person person = new Person("Ankit",32);

          Predicate<Person> agelessThan60 = p -> p.age<60;

          Predicate<Person> isEligibleForVoting = p -> p.age >18;

          Predicate<Person> predicate = isEligibleForVoting.and(agelessThan60);


        }
}
