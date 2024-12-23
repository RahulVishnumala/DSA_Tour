package exceptionHandling;

public class ClassA implements Cloneable
{
    int a = 111;
    int b = 222;

    public ClassA createClone() throws CloneNotSupportedException{
        ClassA obj = (ClassA)super.clone();
        return obj;
    }
}
