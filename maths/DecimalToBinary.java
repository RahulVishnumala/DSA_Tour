package maths;

public class DecimalToBinary {
    public static void binary(int num){

        while(num != 0){
            int rem = num % 2;
            System.out.print(rem);
            num /= 2;
        }
    }
    public static void main(String[] args) {
        binary(86);
    }
}
