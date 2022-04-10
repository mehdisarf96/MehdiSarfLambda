package com.mehdisarf.lambda.unit3.methodreference;

import java.util.function.Consumer;

public class MethodReferenceExample3 {

    public static void main(String[] args) {

        // same Method Reference but...
        something1(System.out::println); // () -> method()
        something2(System.out::println); // p -> method(p)
    }

    public static void something1(Runnable runnable) {
        // nothing
    }

    public static void something2(Consumer<Integer> consumer) {
        // nothing
    }
}
