package com.mehdisarf.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6};
        int key = 3;

        // Behavior behavior = (a, b) -> System.out.println(a / b);

        BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println(a / b); // use Standard Functional Interface from java.util.function instead of using my handmade interface (Behavior).

        process(numbers, key, consumer);
    }

    public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }
}

//  interface Behavior {
//      void doThat(int a, int b);
//  }

