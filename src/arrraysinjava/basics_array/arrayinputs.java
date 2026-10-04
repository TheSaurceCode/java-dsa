package arrraysinjava.basics_array;

import java.util.Scanner;

public class arrayinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of inputs:");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("and your array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

        System.out.println(arr.length);
        sc.close();
    }
}
