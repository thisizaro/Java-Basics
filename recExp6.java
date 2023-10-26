import java.util.*;

public class recExp6 {
    public static int pow(int x, int n)
    {
        if(n == 1)
        {
            return x;
        }
        int power = x * pow(x, n - 1);
        return power;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2;
        sc.close();

        int power = pow(x,n);
        System.out.print(power);
    }
}
