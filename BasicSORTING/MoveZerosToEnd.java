package BasicSORTING;

public class MoveZerosToEnd {
     public static void main(String[]args){
        int[] arr={3,-1,0,5,0,0,8,2,0};
            int i=0;
            int j=1;
            while(j<arr.length){
                if(arr[i]!=0){
                    i++;
                    if(i==j){
                        j++;
                    }
                }
                else if(arr[j]==0){
                    j++;
                }
                else{//(arr[i]==0 && arr[j]!=0)
                    int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                     i++;
                     j++;
                }
            }
            for(int ele:arr){
                System.out.print(ele+" ");
            }
    }
}
   
        
                