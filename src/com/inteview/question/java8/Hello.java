package com.inteview.question.java8;

public class Hello {



    public static void main(String[] args) {

        HelloInterface test = (n) -> System.out.println("Hello");
        test.printString("Hello");
        test.printDefaultString();
        test.printAnotherDefaultString();

        HelloInterface anInterface = new HelloInterface() {
            @Override
            public void printString(String st) {

                System.out.println("Hello an Interface");
            }
        };

        anInterface.printString("Print");
    }


}
