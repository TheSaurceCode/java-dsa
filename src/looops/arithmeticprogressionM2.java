package looops;

import java.util.Scanner;

public class arithmeticprogressionM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int a = sc.nextInt();
        System.out.print("Enter the nth term");
        int n = sc.nextInt();
        System.out.print("Enter the difference :");
        int d = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a+=d;
        }
        sc.close();
    }
}
