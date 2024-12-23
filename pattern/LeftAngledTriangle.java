package pattern;

public class LeftAngledTriangle
{
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while(i <= 5)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
