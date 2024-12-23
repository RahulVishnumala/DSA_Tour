package array;
// Count Even digits
public class EvenNoOfDigits {
    static void count_even_digits(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int numberOfDigits = digits(arr[i]);
            if(arr[i] == 0){
                continue;
            }
            if(numberOfDigits % 2 == 0){
               count++;
            }
       }
        System.out.println("No of even digits elements in the array is "+count);
    }

    static int digits(int num){
        int count = 0;
        if(num < 0){
            num = num * -1;
        }
        while(num > 0){
           count++;
           num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {123,34,567,18,1,10,45,0};
        count_even_digits(nums);
    }
}
