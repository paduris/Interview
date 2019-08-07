package topics.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(5));
    }


    public static int fibonacci(int n)
    {
        if(n < 1)
        {
            return 0;

        }else if (n==1 || n==2)
        {
            return n-1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
