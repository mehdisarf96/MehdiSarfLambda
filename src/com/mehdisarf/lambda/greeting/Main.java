package com.mehdisarf.lambda.greeting;

public class Main {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        // Greeting helloGreeting = new HelloGreeting(); majbur nisti lozuman in karo koni. mituni:
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello :D");
            }
        };

        Greeting lambdaGreeting = () -> System.out.println("Hello :D");

        lambdaGreeting.perform();
        innerClassGreeting.perform();
    }
}
