package arrraysinjava.basics_array;
import java.util.Arrays;

public class shallowanddeepcopyinjava {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50,60,70};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        System.out.println();


        // //shallow copy - changes in the main array no real copy;
        // int [] brr = arr;
        // brr[0]= 90;
        // System.out.print("Array brr :");
        // for (int i = 0; i < brr.length; i++) {
        //     System.out.print(brr[i]+" ");
        // }
        // System.out.println();
        // System.out.print("Array arr :");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }




        //deep copy - real copy a different array is formed and stored in the memory;
        int [] brr = Arrays.copyOf(arr,arr.length);
        brr[0]=90;
        System.out.print("Array brr :");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }

        System.out.println();
        System.out.print("Array arr :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
