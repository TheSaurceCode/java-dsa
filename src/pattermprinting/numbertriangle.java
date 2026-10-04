package pattermprinting;

import java.util.Scanner;

public class numbertriangle {
     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the m value : ");
        // int m = sc.nextInt();

        // for (int i = 1; i <= m; i++) {
        //     System.out.println();
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print( j+ " ");
        //     }
        // }
        // sc.close();


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the m value : ");
        // int m = sc.nextInt();

        // for (int i = 1; i <= m; i++) {
        //     System.out.println();
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print( i+ " ");
        //     }
        // }
        // sc.close();


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the m value : ");
        // int m = sc.nextInt();

        // for (int i = 1; i <= m; i++) {
        //     System.out.println();
        //     for (int j = 1; j <=i; j++) {
        //         if (i%2==0) {
        //             System.out.print((char)(j+64)+" ");
        //         }else System.out.print(j+" ");
        //     }
        // }
        // sc.close();

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m value : ");
        int m = sc.nextInt();

        for (int i = 1; i <=m; i++) {
            System.out.println();
            for (int j =1; j<= m+1-i; j++) {
                System.out.print( "*"+ " ");
            }
        }
        sc.close();
    }
}
