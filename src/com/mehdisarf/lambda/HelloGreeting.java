package com.mehdisarf.lambda;

public class HelloGreeting implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello :D");
    }
}
