import java.util.*;

public class recExp7 {
    public static int pow(int x, int n)
    {
        if(n == 1)
        {
            return x;
        }
        
        if(n % 2 == 0 )
        {
            int power = pow(x, n/2) * pow(x, n/2);
            return power;
        }
        else
        {
            int power = pow(x, n/2) * pow(x, n/2) * x;
            return power;
        }
    }

    public static void main(String args[])
    {
        int x = 2, n = 10;

        int power = pow(x, n);
        System.out.print(power);
    }
}
