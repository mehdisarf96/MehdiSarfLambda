package com.mehdisarf.lambda;

public class Main {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        HelloGreeting helloGreeting = new HelloGreeting();

        MyLambda myLambdaFunction = () -> System.out.println("Hello :D");
    }
}
