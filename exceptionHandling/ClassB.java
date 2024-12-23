package exceptionHandling;

public class ClassB{
    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        System.out.println(aobj1.a+" "+aobj1.b);

        ClassA aobj2 = aobj1;
        aobj2.b = 1000;
        System.out.println(aobj1.a +" "+aobj1.b+" ===> "+aobj2.b);
    }
}
