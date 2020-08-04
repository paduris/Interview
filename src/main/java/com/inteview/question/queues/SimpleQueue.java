package com.inteview.question.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleQueue {


    public static void main (String []a)
    {
        Queue<Integer> queue= new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.stream().forEach(k -> System.out.println(k)        );

        queue.remove();

        System.out.println(((LinkedList<Integer>) queue).getFirst().intValue());








        Stack<Integer> stack= new Stack<Integer>();

    }
}
