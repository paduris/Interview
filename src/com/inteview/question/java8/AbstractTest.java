package com.inteview.question.java8;

public class AbstractTest {
    public static void main(String[] args) {


        Test t1 = new Test();
        Test t2 = new Test();
        if (!t1.equals(t2))
            System.out.println("they're not equal");
    }

}

class Test {

    int a;
}