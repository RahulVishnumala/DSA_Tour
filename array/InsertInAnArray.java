package array;

import java.util.Arrays;

public class InsertInAnArray {
    public void insert(int arr[],int element,int pos){
        for(int i = arr.length-2; i >= pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

    }
}
