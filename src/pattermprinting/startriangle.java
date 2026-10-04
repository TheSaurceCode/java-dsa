package pattermprinting;

import java.util.Scanner;

public class startriangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m value : ");
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println();
            for (int j = 0; j <i ; j++) {
                System.out.print( "* ");
            }
        }
        sc.close();
    }
}
