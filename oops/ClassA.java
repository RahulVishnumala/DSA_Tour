package oops;

public class ClassA extends ClassB implements InterfaceA,InterfaceB
{
    public void meth1(){
        System.out.println("Interface A meth1 implementation done");
    }
    public void msg(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.meth1();
        obj.msg();
        obj.sayHi();
        new ClassB().meth1();
    }
}