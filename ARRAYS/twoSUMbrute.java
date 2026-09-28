package ARRAYS;

public class twoSUMbrute {
    public static void main(String[]args){
        int[] arr={3,0,6,8,3};
        int target=6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("the sum of index "+i+" and index "+j+" is "+target);
                }
            }
        }

    }
    

    
}
