package array;

public class MaxElementInAnArray {
    static void max_element(int[] arr)
    {
        if(arr.length == 0){
            System.out.println("Empty array");
            return;
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element in the array is "+max);
    }

    static void max_in_2DArray(int[][] arr){
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element in 2D array is "+max);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,12,-1,0,15};
        max_element(arr);

        int[][] nums = {{1,2,3},{4,5,6,7,56},{7,8,9}};
        max_in_2DArray(nums);
    }
}
