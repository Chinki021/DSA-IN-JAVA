package ARRAYS;

public class printMAX {
    public static void main(String[]args){
        int[] arr={5,6,-9,10,20,50,8};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        
        }
        System.out.print(max);
    }
    
}
