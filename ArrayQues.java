import java.util.Scanner;
public class ArrayQues {

//     swap to integers
    static void swap(int a , int b)
    {

        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("valeus are "+a+" and "+b);
    }

//     Find the total no of pairs in the array whose sum is equal to the given below code
    static  int pairSum(int [] arr , int target)
    {
        int n= arr.length;
        int ans =0;
        for(int i = 0; i<n;i++)
        {
         for(int j=i+1;j<n;j++)
         {
             if(arr[i]+arr[j]==target)
             {

                 ans++;
             }
         }

        }
        return ans;

    }
//    Count the number of triplets whose sum is equal in the given value x;

    static  int pairSumOfthree(int [] arr , int target)
    {
        int n= arr.length;
        int ans =0;
         for(int i =0;i<n;i++)
         {
             for(int j = i+1;j<n;j++)
             {
                 for(int k=j+1;k<n;k++)
                 {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        ans++;
                    }
                 }
             }
         }
         return ans;
    }
//    Find the Unique number in a given Array where all the elemens are being repeated twice with on value being unique:
//    array is 1 2 3 4 2 1 3
    static int Unqiue(int [] arr)
    {
        int n= arr.length;
            int ans =-1;
            for(int i = 0; i<n;i++) {
                for(int j=i+1;j<n;j++) {
                  if(arr[i]==arr[j]) {
                      arr[i]=-1;
                      arr[j]=-1;
                  }
                }
              }
            for(int i =0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    ans=arr[i];
                }
            }

       return ans;
    }
//    Second Largest elements
     static int findMax(int [] arr)
     {
         int mx= Integer.MIN_VALUE;
         for(int i=0;i< arr.length;i++)
         {
             if(arr[i]>mx)
             {
                 mx=arr[i];
             }
         }
         return mx;
     }
     static int secondMax(int [] arr)
     {
         int mx=findMax(arr);
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==mx)
             {
                 arr[i]=Integer.MIN_VALUE;
             }

         }
         return  findMax(arr);
     }
//     Given an array a constiing of integeres of integers. Return the first value that is repeating in this array. if no value is being reapeted return -1;
    static int repeated(int [] arr)
    {

        for(int i = 0 ;i< arr.length;i++)
        {
            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                 return arr[i] ;
                }

            }

        }
        return -1;
    }
    // Swap an array
    static int[] swaparray(int[] arr)
    {
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            ans[j++]=arr[i] ;
        }
        return ans;
    }
    static void printArray(int [] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
//    swap to array using in place
    static void swapInPlace(int[] arr, int i, int j)
    {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }
    static void swap2(int[]arr)
    {
        int i=0, j= arr.length-1;
        while(i<j)
        {
            swapInPlace(arr,i,j);
            i++;
            j--;
        }
    }
//    Rotate an array kth time
    static int[] rotate(int[] arr, int k)
    {
        int n= arr.length;
        k = k%n;
        int [] ans= new int[n];
        int j =0;
        for(int i = n-k;i<n;i++)
        {
            ans[j++]=arr[i];

        }
        for(int i = 0 ;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie of the array!");
        int n = sc.nextInt();
        int [] array = new int[n];


        System.out.println("Enter the elements");
        for(int i = 0; i<n;i++)
        {
            array[i] = sc.nextInt();
        }

//        System.out.println("Enter the target number to show pair addtion");
//        int target = sc.nextInt();
//        System.out.println( pairSum(array,target));
//        System.out.println(pairSumOfthree(array, target));
//        System.out.println(Unqiue(array));
//        System.out.println(secondMax(array));
//        System.out.println(repeated(array));
//        swap(1,2);
//        int [] printArray=swaparray(array);
//            swap2(array);
        System.out.println("Enter the  k ");
        int k = sc.nextInt();
        int [] ans = rotate(array,k);
        printArray(ans);

    }
}
