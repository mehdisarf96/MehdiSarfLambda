package com.mehdisarf.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int key = 5;

        BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println(a / b);

        process(numbers, key, wrapperLambda(consumer));
    }

    public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }

    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try {
                consumer.accept(a, b);
            } catch (ArithmeticException e) {
                System.out.println("exception caught in wrapper lambda: " + e.getMessage());
            }
        };
    }
}