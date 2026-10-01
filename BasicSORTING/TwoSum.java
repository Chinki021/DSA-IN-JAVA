package BasicSORTING;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[]args){
        int[] arr={2,3,5,4,9};
        int target=7;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("pair found:"+arr[left]+" + "+arr[right]);
                left++;
                right--;
            }
            else if(sum<target)
                left++;
            else right--;
        }
    }
    
}
