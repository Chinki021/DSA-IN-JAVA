// Ques: Multiply odd indexed elements by
// 2 and add 10 to even indexed elements


package ARRAYS;

public class MulODDaddEven {
    public static void main(String[]args){
        int[] arr={3,5,8,9,2,1,7,6};
        int i;
        for(i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+10+" ");
            }
            else System.out.print(arr[i]*2+" ");
        }
        System.out.println();
         for( i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
        
    }
    
}
