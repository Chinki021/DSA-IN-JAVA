// sort element in ascending order

// package BasicSORTING;

// public class BasicBubbleSort {
//     public static void main(String[]args){
//         int[] arr={5,3,2,8,1};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//     }
    
// }


// sort in descending order

// package BasicSORTING;
// public class BasicBubbleSort{
//     public static void main(String[]args){
//         int[] arr={5,3,2,8,1};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]<arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
//             }
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//     }
// }

//bubble sort optimized

package BasicSORTING;
public class BasicBubbleSort{
    public static void main(String[]args){
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            boolean isSwaped=false;
            for(int j=0;j<arr.length-1-i;j++){
                
                     if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     isSwaped=true;
                }
            }
            if(!isSwaped){
                break;
            }
                
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

        

    }
}

