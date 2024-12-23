package oops;

public interface InterfaceB
{
    void msg();
    default void sayHi(){
        System.out.println("Hi");
    }
}
