package ARRAYS;
import java.util.Scanner;

public class Negative {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array you want:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        System.out.print("enter array elements:");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        }
        System.out.println();
        
        for(i=0;i<n;i++){
            if (arr[i]<0){
                System.out.print("the negative element of array is:"+arr[i]+" ");
            }
        }
        sc.close();



    }
    
}
