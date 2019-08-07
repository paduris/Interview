package topics.recursion;

public class ChainOfMethods {

    public static void main(String[] args) {
        ChainOfMethods methods = new ChainOfMethods();
        methods.bar();

        System.out.println("In Main Method ");
    }

    void bar() {
        doWork();

        System.out.println("In Bar Method ");
    }

    void doWork() {
        doMore();

        System.out.println("In doWork method");
    }


    void doMore() {
        System.out.println("In doMore method ");
    }
}
