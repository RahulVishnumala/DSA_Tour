package maths;

public class BinaryToDecimal {
    public static void decimalisation(int num){
        int count = 0;
        int res = 1;
        while(num != 0){
            int rem = num % 10;
            res = res + rem* (int)Math.pow(2,count);
            num /= 10;
            count++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        decimalisation(1010101);
    }
}
