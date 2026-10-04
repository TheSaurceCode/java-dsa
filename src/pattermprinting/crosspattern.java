package pattermprinting;

import java.util.Scanner;

public class crosspattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j<=n; j++) {
        // if (i==j || i+j == n+1) {
        // System.out.print("*" + " ");
        // }else System.out.print(" "+ " ");
        // }
        // System.out.println();
        // }
        // sc.close();

        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // if ((i+j)%2 == 0) {
        // System.out.print("1" );
        // } if ((i+j)%2 == 1) {
        // System.out.print("0" );
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if(i+j > n){
        // System.out.print("*"+ " ");
        // }else System.out.print(" "+ " ");
        // }
        // System.out.println();
        // }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               if(i==j || j>i){
                    System.out.print("*"+ " ");
               }else System.out.print(" "+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
