package ARRAYS;

public class Sum {
    public static void main(String[]args){
        int sum=0;
        int[] arr={3,5,9,-7,-5};
        int i=0;
        while(i<arr.length){
            sum=sum+arr[i];
            
            i++;
        }
        System.out.print(sum);
        

    }
    
}
