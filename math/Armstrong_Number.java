package math;
// Armstrong Number
public class Armstrong_Number
{
    boolean armstrong(int num)
    {
        int temp = num;
        int count = 0;
        while(temp != 0)
        {
           temp = temp/10;
           count++;
        }

        int temp1 = num;
        int ans = 0;
        while(temp1 != 0)
        {
            int rem = temp1 % 10;
            ans = ans + (int) Math.pow(rem,count);
            temp1 = temp1 / 10;
        }

        if(ans == num)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Armstrong_Number obj =new Armstrong_Number();
        boolean flag = obj.armstrong(1634);
        if(flag == true)
        {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
