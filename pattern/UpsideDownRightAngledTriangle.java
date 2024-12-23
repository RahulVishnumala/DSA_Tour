package pattern;

public class UpsideDownRightAngledTriangle
{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++)
        {
            for(int k = 5; k >= n-i ; k--){
                System.out.print("  ");
            }

            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
