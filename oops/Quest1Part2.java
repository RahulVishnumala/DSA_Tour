package oops;

public class Quest1Part2 extends Quest1Part1{
    void display() {
        System.out.println("hi");
        super.meth4();
    }
    static int show(int a) {
        System.out.println(a+a);
        return a+a++;
    }
    Quest1Part2(){
        this(show(50));
        for(int i = 1;;i++) {
            super.meth4();
            break;
        }
        System.out.println("hi");
        System.out.println(show(50));
    }
    Quest1Part2(int a){
        System.out.println("===> "+(a++ + show(50)));
    }
    public static void main(String[] args) {
        new Quest1Part2().display();
    }
}
