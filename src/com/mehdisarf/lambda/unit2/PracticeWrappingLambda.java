package com.mehdisarf.lambda.unit2;

import java.util.function.BiConsumer;

public class PracticeWrappingLambda {
    public static void main(String[] args) {

        // instead of this:
        // perform((a, b) -> System.out.println(a + b));

        // I can have This:
        perform(wrapperLambda1((a, b) -> System.out.println(a + b)));


        //---------------------------------------------------
        //---------------------------------------------------

        perform(wrapperLambda3((a, b) -> System.out.println(a + b)));

    }

    private static void perform(BiConsumer<Integer, Integer> consumer) {
        consumer.accept(1, 2);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda1(BiConsumer<Integer, Integer> consumer) {
        return consumer;
    }

    private static BiConsumer<Integer, Integer> wrapperLambda2(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> System.out.println("salam");
    }

    // now rather than totally ignoring what's passed in, biam ye kare dg bkonam.
    private static BiConsumer<Integer, Integer> wrapperLambda3(BiConsumer<Integer, Integer> consumer) {

        // this is a true wrapper now. I'm basically create a new lambda ex which wraps and contains the lambda
        // that has passed in.
        return (a, b) -> {
            System.out.println("Before");
            consumer.accept(a, b);
            System.out.println("After");
        };
    }
}
