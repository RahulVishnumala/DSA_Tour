package array;

public class LinearSearch
{
    static int linear_search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        // Searching target element
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        // If target is not found then return -1;
        return -1;
    }

    static boolean searchInString(String s,char target)
    {
        if(s.length() == 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int ans = linear_search(arr,0);
        System.out.println("Elements is present at index: "+ans);

        String s = "Rahul";
        boolean ans1 = searchInString(String.valueOf(s),'l');
        System.out.println(ans1);
    }
}
