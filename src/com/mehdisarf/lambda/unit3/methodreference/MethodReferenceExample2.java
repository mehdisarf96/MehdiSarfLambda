package com.mehdisarf.lambda.unit3.methodreference;

import com.mehdisarf.lambda.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mehai", "Sarf", 25),
                new Person("Crank", "Sinatra", 66),
                new Person("Vrank", "Sozz", 66)
        );

        // performConditionally(people, person -> true, p -> System.out.println(p));

        performConditionally(people, person -> true, System.out::println); // p -> method(p)
        // it works fine when the Java compiler gets this method reference, it realizes that
        // this is a consumer so it basically takes in an input then passes it to this method which happens to be sout()
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) { // use Standard Functional Interface from java.util.function instead of using my handmade interface (Condition)
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}