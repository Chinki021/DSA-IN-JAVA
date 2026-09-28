package ARRAYS;

public class linearSearch {
    public static void main(String[]args){
        int[] arr={9,0,8,-9,-6,88,1};
        int target=-9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("element found at index: "+i);
                break;
            }
        }
    }
    
}
