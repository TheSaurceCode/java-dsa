package looops;

import java.util.Scanner;

public class tabless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which tables want to be printed :");
        int n = sc.nextInt();

        for (int i = n; i <= n*10; i+=n) {
            System.out.println(i);
        }
        sc.close();
    }
}
