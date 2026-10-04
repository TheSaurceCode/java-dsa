package looops;

import java.util.Scanner;

public class forloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the times you want to repeat :");
        int  n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello world");
        }
        sc.close();
    }
}
