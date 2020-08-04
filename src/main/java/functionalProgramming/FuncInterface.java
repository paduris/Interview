package functionalProgramming;

@FunctionalInterface
public interface FuncInterface {

    public abstract void printString(String val1, String val2);



    public default void printStringVoid() {
        System.out.println("Into print String void method");
    }


}
