package ARRAYS;


public class secondMAX {
    public static void main(String[]args){
        int[] arr={3,6,-9,8,-7,1,0,8};
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
                
            }
            
        }
        if(smax!=max && smax<max){
                System.out.print("the second max element is:"+smax);
            }

    }
    
}
