package com.mehdisarf.lambda.unit2;

public class ThisReferenceJava8Example {

    public void something(int num, ProcessI process) {
        process.doProcess(num);
    }

    public void execute() {

        something(30, num -> {
            System.out.println(num);
            System.out.println(this); // without Compilation Error.
        });
    }

    public static void main(String[] args) {

        ThisReferenceJava8Example thisReferenceExample = new ThisReferenceJava8Example();

        thisReferenceExample.something(30, num -> {
            System.out.println(num);
            // System.out.println(this); // Compilation Error!: cannot be referenced from a static context.
            // so This will not work!
        });

        thisReferenceExample.execute();
    }
}

interface ProcessI {
    void doProcess(int number);
}