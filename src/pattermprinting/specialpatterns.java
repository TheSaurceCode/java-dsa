package pattermprinting;

import java.util.Scanner;

public class specialpatterns {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value : ");
        // int n = sc.nextInt();

        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(2 * j - 1 + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();     
            // 1 
            // 1 3 
            // 1 3 5 
            // 1 3 5 7 
            //  1 3 5 7 9 
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value : ");
        // int n = sc.nextInt();

        // int a =1;
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(a++  + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        int mid = n/2 + 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                if ( i == mid || j==mid) {
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
