package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException {
    static int amount_avl = 100;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int withdraw_amount = sc.nextInt();
        try{
            if(amount_avl < withdraw_amount){
                throw new MinimumAccountBalance("Insufficient Funds!!!");
            }
            else{
                System.out.println("Please take "+withdraw_amount);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
