import java.util.*;

public class recExp3 {

    public static int printSum(int n){
        if(n <= 0)
        {
            return(0);
        }
        return(n + printSum(n-1));        
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = printSum(n);
        System.out.println(sum);
        sc.close();
    }
    
}
