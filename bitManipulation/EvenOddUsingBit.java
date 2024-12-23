package bitManipulation;

public class EvenOddUsingBit {
    public static void meth1(int num){
        if((num & 1) != 0){
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
    public static void main(String[] args) {
        meth1(17);
    }
}
