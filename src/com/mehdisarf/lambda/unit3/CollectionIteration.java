package com.mehdisarf.lambda.unit3;

import com.mehdisarf.lambda.unit1.exercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Mehai", "Sarf", 75),
                new Person("Crank", "Sinatra", 36),
                new Person("Vrank", "Sozz", 19)
        );

        System.out.println("--Iterate over the list using for loop--");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("\n--Iterate over the list using for-in loop--");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\n--Iterate over the list using lambda--");
        people.forEach(p -> System.out.println(p)); // super crisp and super easy to read.
        // you are telling: "for each element in the list, execute this.

        System.out.println("\n--Iterate over the list using Method Reference of the previous lambda--");
         people.forEach(System.out::println); // balayii also can be substituted with a Method Reference.
    }
}
