package ARRAYS;

public class mergeTWOsortedArray {
    public static void main(String[]args){
        int[] arr1={2,3,5,7,9};
        int[] arr2={3,4,5,6,8};
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else {arr3[k]=arr2[j];
            j++;
            k++;
            }
            

        }
        

        while (i<arr1.length) {
            arr3[k]=arr1[i];
            i++;
            k++;
            
            
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
        
        

    }
    
}
