// 6. Create a program to get an array size and elements as the input from the user. Get a
//number from the user and search for the input number in the array and display “Found” or
//“Not Found” message. Also display the sorted the array. (Note use separate method for
//operations with necessary Exception handling.

import java.util.Scanner;

public class Find {

    public static int searchNum(int arrSize,int findNum,int[] arr)
    {
        int stat=0;
        for(int i=0;i<arrSize;i++)
        {
            if(arr[i]==findNum)
            {
                stat=1;
            }

        }
        return stat;
    }

    public static int[] sort(int arrSize,int[] arr)
    {
        for(int i=0;i<arrSize-1;i++)
        {
            int small=arr[i];
            int smallInd=i;
            for(int j=i+1;j<arrSize;j++)
            {
                if(arr[j]<small)
                {
                    small=arr[j];
                    smallInd=j;
                }
            }
            int temp=arr[i];
            arr[i]=small;
            arr[smallInd]=temp;
        }

        return arr;
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size for array:");
        int arrSize=sc.nextInt();


        int arr[]=new int[arrSize];

        System.out.println("Enter the elements for array:");

        for(int i=0;i<arrSize;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter an element to find in array:");

        int findNum=sc.nextInt();

        int status=searchNum(arrSize,findNum,arr);

        if(status==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");

        }

        int sortArr[]=sort(arrSize,arr);

        System.out.println("Sorted Array:");

        for(int i=0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\t");
        }
    }

}