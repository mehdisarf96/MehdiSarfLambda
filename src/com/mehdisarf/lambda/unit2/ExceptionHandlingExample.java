package com.mehdisarf.lambda.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int key = 0;

        BiConsumer<Integer, Integer> consumer = (a, b) -> System.out.println(a / b);


        WrapperWithException wrapper = (theConsumer, a, b) -> {
            try {

                theConsumer.accept(a, b);

            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        };

        process(numbers, key, wrapper, consumer);
    }

    public static void process(int[] numbers, int key, WrapperWithException wrapper, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers) {
            wrapper.wrap(biConsumer, i, key);
        }
    }

}


interface WrapperWithException {
    void wrap(BiConsumer<Integer, Integer> consumer, int a, int b);
}