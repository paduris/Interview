package functionalProgramming;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Example {


    public static void main(String[] args) {


        FuncInterface funcInterface = (val1, val2) -> System.out.println("Printing String");
        funcInterface.printString("one", "two");
        funcInterface.printStringVoid();


        FuncInterface funcInterface1 = new FuncInterface() {
            @Override
            public void printString(String val1, String val2) {
                System.out.println("Val1 3" + val1 + "Val2  " + val2);
            }
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 8);


        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Functional interface printing :: " + integer);
            }
        };


        numbers.forEach(consumer);


        // noise - anonymous class
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


        numbers.forEach(integer -> System.out.println(integer));

        numbers.forEach(System.out::println);

        numbers.forEach(Example::printString);


        numbers.stream().map(String::valueOf).forEach(System.out::println);


        System.out.println(numbers.stream().reduce((integer, integer2) -> integer = integer + integer2).get());

        System.out.println(numbers.stream().reduce(0, (total,e) -> total = total+e));


    }

    private static void printString(Integer integer) {
        System.out.println(integer);
    }


    static void printString(String val){
        System.out.println(val);
    }




}
