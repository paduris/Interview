package com.inteview.question.java.interview;

public class PolymorphismTest {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.print();
        Animal b = new Horse();
        b.print();
        Animal c = new Horse();
        //c.print("test");

    }
}

class Animal {
    public void print() {
        System.out.println("Animal Print method");
    }
}
class Horse extends Animal {
    public void print() {
        System.out.println("Horse Print method");
    }
    public String print(String val) {
        System.out.println("Horse Print with val " + val);return val;
    }
}