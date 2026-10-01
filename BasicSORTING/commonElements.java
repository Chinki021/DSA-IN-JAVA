package BasicSORTING;
import java.util.Arrays;

public class commonElements {
    public static void main(String[]args){
        int[] arr1={3,2,1,1,9,7,7,5,9,0};
        int[] arr2={3,5,7,9,1,0};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arr3=new int[Math.min(arr1.length,arr2.length)];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                arr3[k]=arr1[i];
                i++;
                j++;
                k++;

            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else j++;
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }

    }
    
}
