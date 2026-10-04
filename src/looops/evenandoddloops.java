package looops;

import java.util.Scanner;

public class evenandoddloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" till ?? :");
        int n = sc.nextInt();

        System.out.println("Even numbers:");
        for (int i = 0; i <=n; i+=2) {
            System.out.println(i);
        }
        System.out.println("Odd numbers:");
        for (int i = 1; i <=n; i+=2) {
             System.out.println(i);
        }
        sc.close();
    }
}
