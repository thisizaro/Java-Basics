import java.util.*;

public class InsertionSort {

    public void sort(int arr[])
    {
        //Code to Sort the array
        int count = 0;

        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                count++;
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    
                }
                else break;
            }
        }
        System.out.println("count = "+count);
    }



    public void sort2(int arr[])
    {
        
        int n = arr.length;
        int count = 0;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                count++;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Count =  "+ count);
    }



    public void printArr(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+", ");
        }
    }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Sort using Insertion sort 
        InsertionSort ob = new InsertionSort();
        ob.sort2(arr);
        ob.printArr(arr);


        sc.close();
    }

    
}
