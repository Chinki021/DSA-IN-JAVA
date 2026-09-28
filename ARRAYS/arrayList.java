package ARRAYS;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList{
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(60);
        arr.add(8);

        System.out.print(arr.get(2));
        arr.set(3,99);
        
    }
}