//fibonacci series
import java.util.*;
public class recExp5 {

    public static void fibo(long a, long b, long n)
    {
        if(n == 0)
        {
            return;
        }
        long c = a + b;
        System.out.print(c+",\n ");
        fibo(b, c, n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        sc.close();

        int a = 0, b = 1;
        System.out.print(a+", "+b+", ");
        fibo(a, b, n-2);
    }

    
}
