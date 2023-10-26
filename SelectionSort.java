import java.util.*;

public class SelectionSort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the list to be inputed: ");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.println("Enter the elements of the array one by one: ");
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        int count = 0;
        
        for(int i=0; i< array.length-1; i++)
        {
            int minPos = i;

            //Select index of the smallest number in the remaining array
            for(int j= i+1; j < array.length; j++)
            {
                count++;
                if(array[j] < array[minPos])
                {
                    minPos = j;
                }
            }
            //Swap array[minPos] with array[i]
            if(minPos!= i )
            {
                array[i] = array[minPos] + array[i];
                array[minPos] = array[i] - array[minPos];
                array[i] = array[i] - array[minPos];
            }
        }

        //Output
        System.out.println("Count = "+ count);
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i]+", ");
        }

        sc.close();
    }
    
}
