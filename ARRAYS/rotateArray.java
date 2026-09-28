//rotate by 3-right rotation


// package ARRAYS;

// public class rotateArray {
//     public static void reverse(int[] arr, int left , int right){
//         while(left<right){
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;

//             left++;
//             right--;
//         }

//     }

//     public static void main(String[]args){
//         int[] arr={4,9,-8,2,6,6,8};
//         int n=arr.length;
//         int d=12;
//         d=d%n;
//         //whole array reverse
//         reverse(arr,0,n-1);
//         //first d reverse
//         reverse(arr,0,d-1);
//         //remaining reverse
//         reverse(arr,d,n-1);

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        
            
//         }


    
    
// }

        //left rotation

package ARRAYS;
public class rotateArray{
    public static void reverse(int[]arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }


    }

    public static void main(String[]args){
        int[] arr={3,6,8,0,-2,-4,7};
        int n=arr.length;
        int k=4;
        k=k%n;

        //reverse first k
        reverse(arr,0,k-1);
        //reverse remaining
        reverse(arr,k,n-1);
        //reverse whole
        reverse(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}


