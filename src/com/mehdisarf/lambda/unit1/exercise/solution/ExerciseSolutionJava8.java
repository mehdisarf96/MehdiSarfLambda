package com.mehdisarf.lambda.unit1.exercise.solution;

import com.mehdisarf.lambda.unit1.exercise.Person;

import java.util.Arrays;
import java.util.List;

public class ExerciseSolutionJava8 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Mehdi", "Sarf", 25),
                new Person("Fehdi", "Artyh", 25),
                new Person("Ray", "Charles", 75),
                new Person("Fay", "Baghban", 75),
                new Person("Uarhad", "Foofoo", 65),
                new Person("Crank", "Sinatra", 66),
                new Person("Vrank", "Sozz", 66)
        );

        people.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("all people \n------------------------");
        printConditionally(people, person -> true); // a simple impl of Condition interface.
        //printAllPersons(people); I dont need this anymore.

        System.out.println("\nall people that have last name beginning with S \n------------------------");
        printConditionally(people, person -> person.getLastName().startsWith("S"));

        System.out.println("\nall people that have first name beginning with F \n------------------------");
        printConditionally(people, person -> person.getFirstName().startsWith("F"));
    }

    private static void printAllPersons(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
