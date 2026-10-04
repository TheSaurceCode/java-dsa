package arrraysinjava.twopointers;

import java.util.Scanner;

public class rotatearray {
    public static void rotate (int [] a , int s , int e){
        while (s<=e) {
            int temp = a[s];
            a[s] = a[e];
            a[e]= temp;

            s++;
            e--;
        }

        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};

        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k :");
        int k = sc.nextInt();

        k=k%n;

        for ( int ele : arr){
            System.out.print( ele+" ");
        }
        System.out.println();

        rotate(arr, 0 , n-k-1);
        System.out.println();
        rotate(arr, n-k , n-1);
        System.out.println();
        rotate(arr, 0, n-1);

        sc.close();
    }
}
