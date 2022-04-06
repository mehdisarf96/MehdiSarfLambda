package com.mehdisarf.lambda.unit2;

import com.mehdisarf.lambda.unit1.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Mehi", "Sarf", 25),
                new Person("Fehi", "Artyh", 25),
                new Person("Ra", "Charles", 75),
                new Person("Fa", "Baghban", 75),
                new Person("Uarhad", "Foofoo", 65),
                new Person("Crank", "Sinatra", 66),
                new Person("Vrank", "Sozz", 66)
        );

        people.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        performConditionally(people, person -> true, p -> System.out.println(p));

        performConditionally(people, person -> person.getLastName().startsWith("S"), p -> System.out.println(p));

        performConditionally(people, person -> person.getFirstName().startsWith("F"), p -> System.out.println(p));
    }

    private static void printAllPersons(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    /*
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p); // printing to the console everytime.
            }
        }
    }
     */

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) { // use Standard Functional Interface from java.util.function instead of using my handmade interface (Condition)
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
