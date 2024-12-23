package array;

public class MinElementInAnArray
{
    static void min_element(int[] arr){
        if(arr.length == 0){
            System.out.println("Empty array");
            return;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array is "+min);
    }

    static void min_in_2DArray(int[][] arr){
        int min = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min element in 2D array is "+min);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,12,1,0,15};
        min_element(arr);

        int[][] nums = new int[][]{{1,2,3},{45,65,39},{1,2,3}};
        min_in_2DArray(nums);
    }
}
