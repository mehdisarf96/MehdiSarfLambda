package com.mehdisarf.lambda.unit2;

public class ClosureJava8Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; // it is effectively final.

        something(a, (number -> System.out.println(number + b)));
    }

    public static void something(int num, ProcessI process) {
        process.doProcess(num);
    }
}

interface ProcessI {
    void doProcess(int number);
}