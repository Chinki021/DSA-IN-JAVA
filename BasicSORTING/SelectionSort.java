//selection sort unstable


// package BasicSORTING;

// public class SelectionSort {
//     public static void main(String[]args){
//         int[] arr={3,2,9,0,5,7,-1};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int minIndex=i;
            
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[minIndex]){
//                     minIndex=j;
//                 }
//             }
                
//             if(arr[i]>arr[minIndex]){
//                     int temp=arr[i];
//                     arr[i]=arr[minIndex];
//                     arr[minIndex]=temp;

//                 }
//             }  
        
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
        
//     }
    
// }


// bada se chota 

package BasicSORTING;

public class SelectionSort {
    public static void main(String[]args){
        int[] arr={3,2,9,0,5,7,-1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int maxIndex=i;
            
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
                
            if(arr[i]<arr[maxIndex]){
                    int temp=arr[i];
                    arr[i]=arr[maxIndex];
                    arr[maxIndex]=temp;

                }
            }  
        
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    
}
