package com.mehdisarf.lambda.unit1.exercise.solution;

import com.mehdisarf.lambda.common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExerciseSolutionJava7 {
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

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("all people \n------------------------");
        printAllPersons(people);

        System.out.println("\nall people that have last name beginning with S\n------------------------");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("S");
            }
        });

        System.out.println("\nall people that have first name beginning with F\n------------------------");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("F");
            }
        });
    }

    private static void printAllPersons(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    /*
        very inflexible method. lastName hayii ke ba H or D or ... shoru mishan ro bekhay bebini,
        bayad ye method dg benevisi.
        btw, in method dare 2 kar mikone: 1) check e inke ba S shoru shode ya na. va 2) print
     */
    private static void printLastNamesBeginningWithS(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("S")) {
                System.out.println(p);
            }
        }
    }
    /*
        what we like to do is have a behavior passed into this method.
        so dar rastaye hamun passing behavior:
     */
    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        } // so you can pass-in different Condition implementation and have it print different stuff
    }
}
