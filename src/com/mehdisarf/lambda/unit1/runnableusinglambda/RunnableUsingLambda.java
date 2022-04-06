package com.mehdisarf.lambda.unit1.runnableusinglambda;

public class RunnableUsingLambda {

    public static void main(String[] args) {

        // A classic case where u can use a Lambda rather than create an anonymous inner class.
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside a anonymous inner class.");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside a Lambda Exp."));
        myLambdaThread.run();
    }
}
