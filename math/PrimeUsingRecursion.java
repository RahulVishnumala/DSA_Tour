package math;
import java.util.Scanner;
public class PrimeUsingRecursion {
    static boolean prime(int n,int i){
        if(i == 1){
            return true;
        }
        else if(n % i == 0){
            return false;
        }
        else{
            return prime(n,--i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(prime(n,n/2));
    }
}
