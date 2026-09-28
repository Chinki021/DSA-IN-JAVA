package ARRAYS;


public class reverseArray {
    public static void main(String[]args){
        int[] arr={2,-9,10,99,7,9};
        int i,j;
        i=0;
        j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    
}
