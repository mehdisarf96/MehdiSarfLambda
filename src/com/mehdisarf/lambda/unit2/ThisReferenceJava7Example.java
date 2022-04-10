package com.mehdisarf.lambda.unit2;

public class ThisReferenceJava7Example {

    public void something(int num, Process process) {
        process.doProcess(num);
    }

    public static void main(String[] args) {

        ThisReferenceJava7Example thisReferenceExample = new ThisReferenceJava7Example();

        // System.out.println(this); // psvm is being called without the the context of
        // an instance of an object. so u cannot really access to 'this' reference.
        // Compilation Error: cannot be referenced from a static context.

        thisReferenceExample.something(30, new Process() {

            @Override
            public void doProcess(int number) {
                System.out.println(number);
                System.out.println(this); // com.mehdisarf.lambda.unit2.ThisReferenceJava7Example$1@1b6d3586
                // be in tak-object e in anonymous class reference dare.
            }
        });
    }
}

interface Process {
    void doProcess(int number);
}