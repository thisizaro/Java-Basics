class recExp1
{
    public static void printNum(int n)
    {
        if (n==0)
            return;
        
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[])
    {
        int N = 10;
        System.out.println("Output using recursion: ");
        printNum(N);
        
    }
}