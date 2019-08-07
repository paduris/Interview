package functionalProgramming;

@FunctionalInterface
public interface FuncInterface {


    public abstract void printString();
    public default void printStringVoid(){
        System.out.println("Into print String void method");
    }

}
