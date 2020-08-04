package com.inteview.question.java8;

@FunctionalInterface
public interface HelloInterface {

    static void printVoidString() {
        System.out.println("Printing Void ");
    }

    static String printHelloString() {
        System.out.println("Hello, World");
        return "Hello, World";
    }

    void printString(String st);

    default String printDefaultString() {
        System.out.println("Default String");
        return "Default String";
    }


    default String printAnotherDefaultString() {
        System.out.println("Another Default String");
        return "Another Default String";
    }
}
