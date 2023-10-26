class arrayIndexSwap {
    public static void main(String args[])
    {
        int i[] = {1,2};

        // index to be swapped are a and b 
        int a=1, b=0;

        System.out.println(i[a]+", "+i[b]);
        i[a] = i[a] + i[b];
        System.out.println(i[a]+", "+i[b]);
        i[b] = i[a] - i[b];
        System.out.println(i[a]+", "+i[b]);
        i[a] = i[a] - i[b];
        System.out.println(i[a]+", "+i[b]);
    }
}
