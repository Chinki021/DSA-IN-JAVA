package ARRAYS;

public class passingArrayTOmethods {
    public static void main(String[]args){
        int[] x={3,5,7,8};
        System.out.println(x[2]);
        change(x);
        System.out.print(x[2]);


    }
    public static void change(int[] x){
        x[2]=99;

    }
    
}
