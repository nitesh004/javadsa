import  java.util.Scanner;
public class BubbleSort {
    void printArray(int array[])
    {
      int n = array.length;
        System.out.println("The array is:");

      for(int i =0 ;i<n;i++)
      {
          System.out.print(array[i]+" ");
      }
        System.out.println();
    }
    void bubbleSort(int array[])
    {
        int n = array.length;
        int i, j, temp;
        for (i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++)
            {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }}}
                }
                void msg()
                {
                    System.out.println("THis is prime number program");
                }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int limit;
        bs.msg();
        System.out.println("Enter the limit of unsorted  array");
        Scanner sc =new Scanner(System.in);
        limit=sc.nextInt();
        int array[]=new int[limit];
        System.out.println("insert the elements into the array ");
        for(int i = 0 ;i<array.length;i++)
        {
            array[i]=sc.nextInt();

        }
        System.out.println("Before the Sorting");
        bs.printArray(array);
        System.out.println("After the Sorting");
        bs.bubbleSort(array);
        bs.printArray(array);


    }
}
