package array;

public class ArrayBasics {

    public void traverse(int[] arr){
        System.out.println("Traversing Array");
        for(int i : arr){
            System.out.print(i);
        }
    }

    public void reverse(int[] arr){
        System.out.println("\nReversing elements in an Array");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayBasics obj = new ArrayBasics();

        int[] arr;
        arr = new int[] {1,2,3,4,5,6};

        obj.traverse(arr);
        obj.reverse(arr);
    }
}
