package ARRAYS;
import java.util.Scanner;

public class product {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int Product=1;
        int i=0;
        while(i<arr.length){
            Product*=arr[i];
            i++;

        }
        System.out.print(Product);

    }
    
}
