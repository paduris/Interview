package functionalProgramming;

public class Main1 {
    public static void main(String[] args) {

        // ceremony - pure noise - it doesn't have value
        // function has 4 things - name,body ( most important thing) ,return type ( don't have much value), parameters ( need )
        // lambda expression - parameters and body, it doesn't have name and return type (inferred)


        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });
        th.start();


        // lambda expression
        Thread thLambda = new Thread(() -> System.out.println("In another thread"));
        thLambda.start();


        System.out.println("In main");
    }
}
