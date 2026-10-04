package pattermprinting;

import java.util.Scanner;

public class alphabetprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m value : ");
        int m = sc.nextInt();
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print((char)(64+i) + " ");
            }
        }
        sc.close();
    }
}
