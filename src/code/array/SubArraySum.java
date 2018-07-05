package code.array;

import java.util.Scanner;

public class SubArraySum {
    private static int sumOfSubArray(int arr[]){
        int len=arr.length;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<len;len++){
            for(int j=i;j<len;j++){
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("sum of all sub arrays is : "+sumOfSubArray(arr));
    }
}
