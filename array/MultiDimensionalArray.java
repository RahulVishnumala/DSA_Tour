package array;

import java.util.Scanner;

public class MultiDimensionalArray {

    public void meth(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows:");
        int row = sc.nextInt();
        System.out.println("Enter columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        // Taking Input
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println("Enter element at row "+i+" column "+j+": ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Retrieving Array
        System.out.println("Elements are: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        MultiDimensionalArray obj = new MultiDimensionalArray();
        obj.meth();
    }
}
