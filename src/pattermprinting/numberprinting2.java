package pattermprinting;

import java.util.Scanner;

public class numberprinting2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m value : ");
        int m = sc.nextInt();
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(1+i + " ");
            }
        }
        sc.close();
    }
}
