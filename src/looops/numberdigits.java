package looops;

import java.util.Scanner;

public class numberdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int a = 0;

        while (n!=0) {
            n /= 10;
         a++;

        }

        System.out.println(a);

        sc.close();
    }
}
