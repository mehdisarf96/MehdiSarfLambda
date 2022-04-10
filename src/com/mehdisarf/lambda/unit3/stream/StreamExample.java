package com.mehdisarf.lambda.unit3.stream;

import com.mehdisarf.lambda.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Vaniok", "Hendevaneii", 43),
                new Person("Mehai", "Sarf", 25),
                new Person("Crank", "Hinatra", 26),
                new Person("Vrank", "Sozz", 66),
                new Person("Hami", "Halva", 43)
        );
        // --------------------------------------------------
        people.stream()
                .filter(person -> person.getFirstName().startsWith("V"))
                .forEach(person -> System.out.println(person));
        // --------------------------------------------------
        long count = people.stream()
                .filter(person -> person.getLastName().startsWith("H"))
                .count();
        System.out.println(count);
        // --------------------------------------------------
        Stream<Person> stream = people.stream()
                .filter(person -> person.getFirstName().startsWith("V"));
        // --------------------------------------------------
        people.parallelStream()
                .filter(person -> person.getFirstName().startsWith("V"))
                .forEach(person -> System.out.println(person));
    }
}
