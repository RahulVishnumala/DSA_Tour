package array;

import java.util.Arrays;

public class DeleteInAnArray {
    public void delete(int arr[],int pos){
        for(int i = pos; i >= arr.length-2; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

    }
}
