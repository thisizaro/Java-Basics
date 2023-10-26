import java.util.*;

class exp1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < a ; i++) // first loop
        {
            for(int j = 0; j < b ; j++) //2nd loop
            {
                System.out.print("Hello World ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}