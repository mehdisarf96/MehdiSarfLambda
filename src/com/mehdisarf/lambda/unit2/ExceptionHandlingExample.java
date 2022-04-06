package com.mehdisarf.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int key = 3;

        BiConsumer<Integer, Integer> consumer = (a, b) -> {
            try {

                System.out.println(a / b);

            } catch (ArithmeticException e) {
                System.out.println("An Arithmetic Exception happened.");
            }
        };

        process(numbers, key, consumer);
    }

    public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            biConsumer.accept(i, key);
        }
    }
}

