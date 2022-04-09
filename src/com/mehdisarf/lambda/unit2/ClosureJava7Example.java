package com.mehdisarf.lambda.unit2;

public class ClosureJava7Example {
    public static void main(String[] args) {
        int a = 10;
        // final int b = 20; // it was necessary in java 7
        int b = 20; // it is effectively final.

        something(a, new Process() {

            @Override
            public void doProcess(int number) {
                System.out.println(number + b);
            }
        });

    }

    public static void something(int num, Process process) {
        process.doProcess(num);
    }
}

interface Process {
    void doProcess(int number);
}