package practice;

public class ClassA {
    static {
        System.out.println("static block called");
    }

    ClassA(){
        System.out.println("Constructor called");
    }
    {
        System.out.println("Instance block called");
    }
    public static void main(String[] args) {
        new ClassA();
    }
}
