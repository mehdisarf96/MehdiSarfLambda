package com.mehdisarf.lambda.unit3.methodreference;

public class MethodReferenceExample1 {

    public static void main(String[] args) {

        // when u have a lambda ex which takes no input args and it's calling a method
        // without any arguments, then u can replace this lambda ex with a Method Reference.

        // Thread thread = new Thread(() -> printMessage());
        Thread thread = new Thread(MethodReferenceExample1::printMessage); // () -> method()
        // in va balaii daqiqan moadel e hamand and these two are alternate syntax for each others.
        // MethodReferenceExample1::printMessage === () -> printMessage()   (no input args and just call a method without any args)

        // basically u're telling the Java compiler (or runtime) that this expression (MethodReferenceExample1::printMessage)
        // is basically a 'pass-through'. all I need to do is execute this 'printMessage' method.
        // it's just passing through the control. u're not doing anything extra.
        // so if all u are doing is just executing a method in your lambda, u can use a Method Reference.for it.

        thread.start();
    }

    public static void printMessage() {
        System.out.println("Hi Mehdi.");
    }
}
