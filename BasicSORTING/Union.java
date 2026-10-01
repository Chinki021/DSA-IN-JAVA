package BasicSORTING;
import java.util.Arrays;

public class Union {
    public static void main(String[]args){
        int[] arr1={3,2,1,1,9,7,7,5,9,0};
        int[] arr2={3,5,7,9,1,0};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                //duplicate hai ya nhi
                if(k==0||arr3[k-1]!=arr1[i]){
                    arr3[k]=arr1[i];
                    
                    k++;
                }
                i++;
                j++;
                
            }
            else if(arr1[i]<arr2[j]){
                //duplicate find
                if(k==0||arr3[k-1]!=arr1[i]){
                    arr3[k]=arr1[i];
                    
                    k++;
                }
                i++;
                
            }
            else{
                if(k==0||arr3[k-1]!=arr2[j]){
                    arr3[k]=arr2[j];
                    
                    k++;
                }
                
                j++;
                
            }
        }

//arr1 ke remaining
        while(i<arr1.length){
             if(k==0||arr3[k-1]!=arr1[i]){
                    arr3[k]=arr1[i];
                    
                    k++;
                }
            
            i++;
            
        }
        //arr2 k remaining
        while(j<arr2.length){
            if(k==0||arr3[k-1]!=arr2[j]){
                    arr3[k]=arr2[j];
                    
                    k++;
                }
            
            
            j++;
        }


        for(int x=0;x<k;x++){
            System.out.print(arr3[x]+" ");
        }
        

    }
    
}
