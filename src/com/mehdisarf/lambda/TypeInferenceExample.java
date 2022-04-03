package com.mehdisarf.lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {

        DivideLambda safeDivideFunction = (a, b) -> { // because of Type Inference.
            if (b == 0)
                return 0;
            return a / b;
        };

        printDivide(safeDivideFunction);
        // -----------------------------------------------------------------------------------------------------

        StringLengthLambda stringLengthCountFunction = string -> string.length(); // because of Type Inference.

        printLengthOfString(string -> string.length());

    }

        // -----------------------------------------------------------------------------------------------------
    public static void printDivide(DivideLambda lambda) {
        System.out.println(lambda.div(4, 0));
    }

    public static void printLengthOfString(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("hello how are you?"));
    }
}