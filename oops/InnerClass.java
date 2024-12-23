package oops;

public class InnerClass {
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Test a = new Test("Raj");
        Test b = new Test("Ram");

        System.out.println(a.name+","+b.name);
    }

}
