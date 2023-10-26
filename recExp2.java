import java.util.*;
public class recExp2 {

    public static void sortArr(int ar[])
    {
        
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        for(int i = 0; i < 5; i++)
        {
            ar[i] = sc.nextInt();
        }

        sortArr(ar);

        System.out.println("  ---   ");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(ar[i]);
        }
        sc.close();
    }
}
