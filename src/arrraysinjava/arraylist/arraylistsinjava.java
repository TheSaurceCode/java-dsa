package arrraysinjava.arraylist;

import java.util.ArrayList;

public class arraylistsinjava {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);


        System.out.println(arr.get(4));

        arr.set(4, 80);

        System.out.println(arr.get(4));
    }
}
